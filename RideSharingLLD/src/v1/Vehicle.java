package v1;

public class Vehicle {
	private String vehicleId;
	private VehicleType type;
	
	Vehicle(String vehicleId, VehicleType type) {
		this.vehicleId = vehicleId;
		this.type = type;
	}
	
	public VehicleType getType() {
		return this.type;
	}
}
