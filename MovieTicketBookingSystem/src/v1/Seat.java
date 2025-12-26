package v1;

public class Seat {
	private String seatNumber;
	private boolean isBooked;
	
	public Seat(String seatNumber) {
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	
	public boolean isBooked() {
		return isBooked;
	}
	
	public void book() {
		if (isBooked) {
			throw new IllegalStateException("Seat " + seatNumber + " is already booked.");
		}
		this.isBooked = true;
	}
	
	public String getSeatNumber() {
		return seatNumber;
	}
}
