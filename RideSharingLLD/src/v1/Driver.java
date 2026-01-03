package v1;

public class Driver extends User {
	private DriverStatus status;
	private Vehicle vehicle;
	
	Driver(String userId, String name, Vehicle vehicle) {
		super(userId, name);
		this.vehicle = vehicle;
		this.status = DriverStatus.OFFLINE;
	}
	
	public boolean isAvailable() {
		return this.status == DriverStatus.AVAILABLE;
	}
	
	public void setStatus(DriverStatus status) {
		this.status = status;
	}
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public String getName() {
		return this.name;
	}
}
