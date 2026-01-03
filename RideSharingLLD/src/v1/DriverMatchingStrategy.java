package v1;

import java.util.List;

public interface DriverMatchingStrategy {
	Driver findDriver(List<Driver> drivers, Trip trip);
}
