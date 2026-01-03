package v1;

public class Trip {
	private String tripId;
	private Rider rider;
	private Driver driver;
	private TripStatus status;
	
	Trip(String tripId, Rider rider) {
		this.tripId = tripId;
		this.rider = rider;
		this.status = TripStatus.REQUESTED;
	}
	
	public synchronized void assignDriver(Driver driver) {
		this.driver = driver;
		this.status = TripStatus.DRIVER_ASSIGNED;
	}
	
	public synchronized void startTrip() {
		this.status = TripStatus.STARTED;
	}
	
	public synchronized void completeTrip() {
		this.status = TripStatus.COMPLETED;
	}
	
	public TripStatus getStatus() {
		return this.status;
	}
	
}
