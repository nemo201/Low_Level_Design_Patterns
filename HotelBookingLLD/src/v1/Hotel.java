package v1;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	String hotelId;
	String name;
	String location;
	List<Room> rooms = new ArrayList<>();
	
	Hotel(String hotelId, String name, String location) {
		this.hotelId = hotelId;
		this.name = name;
		this.location = location;
	}
	
	List<Room> getAvailableRooms(DateRange dateRange, RoomType roomType) {
		return rooms.stream().filter(r -> r.roomType == roomType && r.isAvailable(dateRange)).toList();
	}
}
