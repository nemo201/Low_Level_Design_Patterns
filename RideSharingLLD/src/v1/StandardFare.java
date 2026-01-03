package v1;

public class StandardFare implements FareStrategy {

	@Override
	public double calculateFare(double distanceKm, double durationMinutes) {
		return 50 + (10 * distanceKm) + (2 * durationMinutes);
	}

}
