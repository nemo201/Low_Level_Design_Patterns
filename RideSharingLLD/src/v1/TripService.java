package v1;

import java.util.List;
import java.util.UUID;

public class TripService {
	private DriverMatchingStrategy matchingStrategy;
	private FareStrategy fareStrategy;
	private NotificationManager notificationManager;
	
	TripService(DriverMatchingStrategy matchingStrategy, FareStrategy fareStrategy, NotificationManager notificationManager) {
		this.matchingStrategy = matchingStrategy;
		this.fareStrategy = fareStrategy;
		this.notificationManager = notificationManager;
	}
	
	public Trip createTrip(Rider rider, List<Driver> drivers) {
		Trip trip = new Trip(UUID.randomUUID().toString(), rider);
		Driver driver = matchingStrategy.findDriver(drivers, trip);
		
		driver.setStatus(DriverStatus.BUSY);
		trip.assignDriver(driver);
		notificationManager.notifyAll("Driver " + driver.getName() + " assigned to Rider " + rider.getName());
		return trip;
	}
	
	public double endTrip(Trip trip, double distanceKm, double time) {
		trip.completeTrip();
		return fareStrategy.calculateFare(distanceKm, time);
	}
}
