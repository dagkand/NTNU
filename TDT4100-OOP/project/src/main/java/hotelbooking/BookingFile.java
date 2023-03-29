package hotelbooking;


import java.io.FileNotFoundException;


public interface BookingFile {
	
	//lese fra fil
	Booking load(String filename) throws FileNotFoundException;

	//skrive til fil
	void save(String filename, Booking booking) throws FileNotFoundException;

}