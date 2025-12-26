package v1;

import java.util.List;

public class Screen {
	private String screenId;
	private List<Seat> seats;

	public Screen(String screenId, List<Seat> seats) {
		this.screenId = screenId;
		this.seats = seats;
	}

	public List<Seat> getAvailableSeats() {
		return seats.stream().filter(seat -> !seat.isBooked()).toList();
	}
	
	public Seat getSeat(String seatNumber) {
		return seats.stream()
				.filter(seat -> seat.getSeatNumber().equals(seatNumber))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Seat " + seatNumber + " does not exist."));
	}
}
