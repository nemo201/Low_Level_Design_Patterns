package elevatorV1;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
	private ElevatorController controller;
	
	ElevatorSystem(int elevatorCount) {
		List<Elevator> elevators = new ArrayList<>();
		for (int i = 0; i < elevatorCount; i++) {
			elevators.add(new Elevator(i));
		}
		controller = new ElevatorController(elevators);
	}
	
	public void requestElevator(int floor, Direction direction) {
		Request request = new Request(floor, direction);
		controller.submitExternalRequest(request);
	}
	
	void step() {
		controller.stepAll();
	}
}
