package hotelbooking;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List; 

public class Booking {
	
	private String name;
	
	private String email;
	
	private LocalDate checkIn;
	
	private LocalDate checkOut;
	
	private List<Room> bookedRooms = new ArrayList<>();
	
	private float totalPrice = 0;  
	
	
	//validering av navn
	public void setName(String name) {
		if (!name.matches(".+")) {
			throw new IllegalArgumentException("Invalid name");
		}
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		if (!email.matches("^(?=.{1,30}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9_-]+)*(\\.[A-Za-z]{2,})$")) {
			throw new IllegalArgumentException("Invalid email");
		}
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	//validering av dato for innsjekk
	public void setCheckIn(LocalDate checkIn) {
		LocalDate today = LocalDate.now(); 
		if (checkIn == null || checkIn.isBefore(today)) {
				throw new IllegalArgumentException("Invalid check in date");
		}
		this.checkIn = checkIn;			
	}
	
	//validering av dato for utsjekk
	public void setCheckOut(LocalDate checkOut) {
		LocalDate today = LocalDate.now(); 
		if (checkOut == null || checkOut.isBefore(today) || checkOut.isBefore(getCheckIn()) || getCheckIn().equals(checkOut)) {
				throw new IllegalArgumentException("Invalid check out date");
		}		
		this.checkOut = checkOut;
	}
	
	public LocalDate getCheckIn() {
		return checkIn;
	}
	
	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	//booke nytt rom
	public void addRoom(Room room) {
		bookedRooms.add(room);
		totalPrice += Room.getRoomPrice(room.getRoomType()); 
	}
		
	//fjerne rom som er booket
	public void removeRoom(Room room) {
		if (!bookedRooms.contains(room)) {
			throw new IllegalArgumentException("This room is not booked");
		}
		bookedRooms.remove(room);
				
	}
	
	//liste med rom som er booket
	public List<Room> getBookedRooms() {
		return new ArrayList<>(bookedRooms);
	}
	
	public void setBookedRooms(List<Room> bookedRooms) {
		this.bookedRooms = bookedRooms;
	}
	
	//antall rom som er booket
	public int getNumberOfBookedRooms() {
		return bookedRooms.size();
	}
	
	
	//totalpris for booking
	public float getTotalPrice(LocalDate checkIn, LocalDate checkOut) {
		return (ChronoUnit.DAYS.between(checkIn, checkOut) * totalPrice);
	}
	
	
	public void setTotalPrice(float totalPrice) {
		if (totalPrice < 0) {
			throw new IllegalArgumentException();
		}
		this.totalPrice = totalPrice;
	}
	


	
	@Override
	public String toString() {
		String booking = "Your booking: \n";
		booking += "---------------------\n";
		booking += "Name: " + getName() + "\n";
		booking += "Email: " + getEmail() + "\n";
		booking += "Check in: " + getCheckIn() + "\n";
		booking += "Check out: " + getCheckOut() + "\n";
		booking += "Your rooms: " + getBookedRooms() + "\n";
		booking += "---------------------\n";
		booking += "Total price: " + getTotalPrice(getCheckIn(), getCheckOut());
		return booking;
	
	}
	
	
	public static void main(String[] args) {
		Booking booking = new Booking();
		booking.setName("Knut Knutsen");
		booking.setEmail("knutk@ntnu.no");
		booking.setCheckIn(LocalDate.of(2021, Month.JULY, 4));
		booking.setCheckOut(LocalDate.of(2021, Month.JULY,10));
		booking.addRoom(new Room("Standard"));
		booking.addRoom(new Room("Single"));
		booking.addRoom(new Room("Suite"));

		System.out.println(booking);
	}


}