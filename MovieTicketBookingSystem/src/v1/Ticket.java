package v1;

public class Ticket {
	private Booking booking;
	
	public Ticket(Booking booking) {
		this.booking = booking;
	}
	
	public void printTicket() {
		System.out.println("Ticket for Booking ID: " + booking.getBookingId());
		System.out.println("Show Details: " + booking.getShow().getMovie().getName());
		System.out.println("Booked Seats: ");
		for (Seat seat : booking.getBookedSeats()) {
			System.out.println(" - " + seat.getSeatNumber());
		}
	}
}
