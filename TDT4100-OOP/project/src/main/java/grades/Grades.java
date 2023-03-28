package grades;

import java.util.ArrayList;
import java.util.List; 

public class Grades {
	
	private String name;
	
	private String course;
	
	private int grade;

	
	
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
	

	//validering av dato for innsjekk
	public void setcourse(String course) {
		if (!course.matches("^[A-Z]{1,5}\\d{4}$")) {
				throw new IllegalArgumentException("Invalid course name");
		}
		this.course = course;			
	}

    public String getCourse() {
		return course;
	}
	
	//validering av dato for utsjekk
	public void setGrade(String grade) {
		if (!grade.contains("^[1-6]$")) {
				throw new IllegalArgumentException("Invalid grade");
		}		
		this.grade = Integer.parseInt(grade);
	}
	
	public String getGrade() {
		return grade;
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

}