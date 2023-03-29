package hotelbooking;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;


public class BookingFileSupport implements BookingFile {
	
	 
	//stilen til mappen der filene lagres 
	public final static String SAVE_FOLDER = "src/main/java/hotelBookingSystem/saves/";
	
	
	//hjelpemetode for å lage sti til filer
	public static String getFilePath(String filename) {
		return SAVE_FOLDER + filename + ".txt";
	}
	
	//skrive til fil
	@Override
	public void save(String filename, Booking booking) throws FileNotFoundException {
		try (PrintWriter writer = new PrintWriter(getFilePath(filename))) {
			writer.println(booking.getName());
			writer.println(booking.getEmail());
			writer.println(booking.getCheckIn());
			writer.println(booking.getCheckOut());
			writer.println(booking.getBookedRooms());
			writer.println(booking.getTotalPrice(booking.getCheckIn(), booking.getCheckOut()));
		}
		
	}

	
	//lese fra fil
	@Override
	public Booking load(String filename) throws FileNotFoundException {
		Booking booking = null;
		try (Scanner scanner = new Scanner(new File(getFilePath(filename)))) {
			booking = new Booking();
		
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					
					if (line == null || line.length() == 0) {
						break;
					}
					else if (booking.getName() == null) {
						booking.setName(line);
					}
					else if (booking.getEmail() == null) {
						booking.setEmail(line);
					}
					else if (booking.getCheckIn() == null) {
						LocalDate date = LocalDate.parse(line);
						booking.setCheckIn(date);
					}
					else if (booking.getCheckOut() == null) {
						LocalDate date = LocalDate.parse(line);
						booking.setCheckOut(date);
					}
					
					else if (booking.getBookedRooms().isEmpty()) {
						String[] rooms = line.split(",");
						for (String room: rooms) {
							booking.addRoom(new Room(room.replaceAll("\\[", "").replaceAll("\\]","").replaceAll(" ", "")));
						}
					}
					else if (booking.getTotalPrice(booking.getCheckIn(), booking.getCheckOut()) == 0) {
						float totalprice = Float.parseFloat(line);
						booking.setTotalPrice(totalprice);
					}
				}
			}
			return booking;
		}
	



}