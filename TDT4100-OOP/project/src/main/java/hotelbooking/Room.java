package hotelbooking;

import java.util.Arrays;
import java.util.List;


public class Room {

	private String roomType; 
	
	public static final List<String> roomTypes= Arrays.asList("Standard", "Single", "Family", "Suite");

	
	public Room(String roomType) {
		if(!roomTypes.contains(roomType)) {
			throw new IllegalArgumentException("Invalid type of room");
		}
		this.roomType = roomType;
	}

	
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		if (!roomTypes.contains(roomType)) {
			throw new IllegalArgumentException("Invalid type of room");
		}
		this.roomType = roomType;
	}

	//pris for typen rom
	public static int getRoomPrice(String roomType) {
		int roomPrice = switch(roomType) {
		case "Standard" -> 800;
		case "Single" -> 600;
		case "Family" -> 1200;
		case "Suite" ->  2000;
		default -> throw new IllegalArgumentException("Invalid type of room");
		};
		
		return roomPrice;
		
	}

	@Override
	public String toString() {
		return "" + roomType + "";
	}	
	
	public static void main(String[] args) {
		Room room = new Room("Standard");
		System.out.println(room);
		room.setRoomType(null);
		
	}


}