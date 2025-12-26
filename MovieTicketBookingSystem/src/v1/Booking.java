package v1;

import java.util.List;

public class Booking {
	private String bookingId;
	private Show show;
	private List<Seat> bookedSeats;
	
	public Booking(String bookingId, Show show, List<Seat> bookedSeats) {
		this.bookingId = bookingId;
		this.setShow(show);
		this.bookedSeats = bookedSeats;
	}
	
	public List<Seat> getBookedSeats() {
		return bookedSeats;
	}

	public String getBookingId() {
		return bookingId;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}
}
