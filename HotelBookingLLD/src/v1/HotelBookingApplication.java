package v1;

import java.time.LocalDate;
import java.util.List;

public class HotelBookingApplication {
	public static void main(String[] args) {
		Hotel hotel = new Hotel("H1", "Grand Hotel", "New York");
		Room room1 = new Room("R1", RoomType.DELUXE, 200);
		Room room2 = new Room("R2", RoomType.STANDARD, 100);
		Room room3 = new Room("R3", RoomType.SUITE, 300);

		hotel.rooms.add(room1);
		hotel.rooms.add(room2);
		hotel.rooms.add(room3);

		User user = new User("U1", "Alice");

		DateRange stay = new DateRange(LocalDate.of(2026, 1, 10), LocalDate.of(2026, 1, 12));

		BookingService bookingService = new BookingService();

		System.out.println("Available STANDARD rooms:");
		List<Room> availableRooms = hotel.getAvailableRooms(stay, RoomType.STANDARD);

		for (Room r : availableRooms) {
			System.out.println("Room ID: " + r.roomId + ", Price per night: " + r.pricePerNight);
		}

		Booking booking = null;
		try {
			booking = bookingService.bookRoom(hotel, user, RoomType.STANDARD, stay);
			System.out.println(
					"Booking successful! Booking ID: " + booking.bookingId + ", Room ID: " + booking.room.roomId);
		} catch (RuntimeException e) {
			System.out.println("Booking failed" + e.getMessage());
		}

		// double booking
		try {
			bookingService.bookRoom(hotel, user, RoomType.STANDARD, stay);
		} catch (RuntimeException e) {
			System.out.println("Second booking attempt failed: " + e.getMessage());
		}

		bookingService.cancelBooking(booking);
		System.out.println("Booking cancelled for Booking ID: " + booking.bookingId);

		try {
			Booking newBooking = bookingService.bookRoom(hotel, user, RoomType.STANDARD, stay);
			System.out.println("Re-booking successful!");
			System.out.println("New Booking ID: " + newBooking.bookingId);
		} catch (Exception e) {
			System.out.println("Re-booking failed: " + e.getMessage());
		}
	}
}
