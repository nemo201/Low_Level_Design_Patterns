package v1;

import java.util.List;

public class NearestDriverStrategy implements DriverMatchingStrategy{

	@Override
	public Driver findDriver(List<Driver> drivers, Trip trip) {
		return drivers.stream()
				.filter(Driver :: isAvailable)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("No available drivers"));
	}

}
