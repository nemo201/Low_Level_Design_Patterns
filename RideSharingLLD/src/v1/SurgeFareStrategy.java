package v1;

public class SurgeFareStrategy implements FareStrategy {

	@Override
	public double calculateFare(double distanceKm, double durationMinutes) {
		return 1.5 * (50 + (10 * distanceKm) + (2 * durationMinutes));
	}


}
