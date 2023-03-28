package grades;


import java.io.FileNotFoundException;

import hotelBookingSystem.model.Booking;


public interface HotelBookingFile {
	
	//lese fra fil
	Booking load(String filename) throws FileNotFoundException;

	//skrive til fil
	void save(String filename, Booking booking) throws FileNotFoundException;