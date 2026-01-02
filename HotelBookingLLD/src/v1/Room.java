package v1;

import java.util.ArrayList;
import java.util.List;

public class Room {
	protected String roomId;
	protected RoomType roomType;
	double pricePerNight;
	List<Booking> bookings = new ArrayList<>();
	
	Room(String roomId, RoomType roomType, double pricePerNight) {
		this.roomId = roomId;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
	}
	
	boolean isAvailable(DateRange dateRange) {
		for (Booking b : bookings) {
			if (b.getDateRage().overLaps(dateRange)) {
				return false;
			}
		}
		return true;
	}
}
