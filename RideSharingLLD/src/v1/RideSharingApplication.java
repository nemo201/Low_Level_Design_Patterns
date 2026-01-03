package v1;

import java.util.ArrayList;
import java.util.List;

public class RideSharingApplication {
	public static void main(String[] args) {
		Vehicle sedan = new Vehicle("V1", VehicleType.CAR);
		Vehicle suv = new Vehicle("V2", VehicleType.SUV);

		Driver driver1 = new Driver("D1", "Amit", sedan);
		Driver driver2 = new Driver("D2", "Rahul", suv);

		driver1.setStatus(DriverStatus.AVAILABLE);
		driver2.setStatus(DriverStatus.AVAILABLE);

		List<Driver> drivers = new ArrayList<>();
		drivers.add(driver1);
		drivers.add(driver2);

		Rider rider = new Rider("R1", "Priya");

		NotificationManager notificationManager = new NotificationManager();
		notificationManager.addObserver(new PushNotificationService());

		DriverMatchingStrategy matchingStrategy = new NearestDriverStrategy();

		FareStrategy fareStrategy = new StandardFare();

		TripService tripService = new TripService(matchingStrategy, fareStrategy, notificationManager);

		System.out.println("\n🚕 Rider requesting a ride...");
		Trip trip = tripService.createTrip(rider, drivers);

		// 8️⃣ Start trip
		System.out.println("\n▶️ Trip started");
		trip.startTrip();

		// 9️⃣ End trip
		System.out.println("\n🏁 Trip completed");
		double fare = tripService.endTrip(trip, 12.5, 18);

		// 🔟 Print final fare
		System.out.println("\n💰 Total Fare: ₹" + fare);
	}
}
