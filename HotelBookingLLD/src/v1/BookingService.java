package v1;

import java.util.UUID;

public class BookingService {
	public Booking bookRoom(Hotel hotel, User user, RoomType roomType, DateRange dateRange) {
		for (Room room : hotel.rooms) {
			if (room.roomType == roomType && room.isAvailable(dateRange)) {
				Booking booking = new Booking(UUID.randomUUID().toString(), user, room, dateRange);
				room.bookings.add(booking);
				return booking;
			}
		}
		throw new RuntimeException("No rooms available");
	}
	
	public void cancelBooking(Booking booking) {
		Room room = booking.room;
		room.bookings.remove(booking);
	}
}
