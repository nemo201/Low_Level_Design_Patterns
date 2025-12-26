package v1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookingService {
	public Ticket bookSeats(Show show, List<String> seatNumbers) {
		List<Seat> bookedSeats = new ArrayList<>();
		
		for (String seatNumber : seatNumbers) {
			Seat seat = show.getScreen().getSeat(seatNumber);
			seat.book();
			bookedSeats.add(seat);
		}
		
		Booking booking = new Booking(UUID.randomUUID().toString(), show, bookedSeats);
		
		return new Ticket(booking);
	}
}
