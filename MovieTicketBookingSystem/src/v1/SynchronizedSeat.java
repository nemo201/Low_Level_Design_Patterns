package v1;

public class SynchronizedSeat {
	private SeatStatus status = SeatStatus.AVAILABLE;
	private long lockTime;

	public synchronized void lock() {
		if (status != SeatStatus.AVAILABLE) {
			throw new RuntimeException("Seat is not available.");
		}
		status = SeatStatus.LOCKED;
		lockTime = System.currentTimeMillis();
	}

	public synchronized void confirmBooking() {
		if (status != SeatStatus.LOCKED) {
			throw new RuntimeException("Seat is not locked.");
		}
		status = SeatStatus.BOOKED;
	}

	public synchronized void unlockIfExpired(Long expiryDuration) {
		if (status == SeatStatus.LOCKED && System.currentTimeMillis() - lockTime > expiryDuration) {
			status = SeatStatus.AVAILABLE;
		}
	}
}
