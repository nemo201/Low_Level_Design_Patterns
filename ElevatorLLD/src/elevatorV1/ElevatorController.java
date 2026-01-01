package elevatorV1;

import java.util.List;

public class ElevatorController {
	private List<Elevator> elevators;
	
	ElevatorController(List<Elevator> elevators) {
		this.elevators = elevators;
	}
	
	void submitExternalRequest(Request request) {
		Elevator bestElevator = findNearestIdleElevator(request.getFloor());
		bestElevator.addRequest(request.getFloor());
		
	}

	private Elevator findNearestIdleElevator(int floor) {
		Elevator best = null;
		int minDistance = Integer.MAX_VALUE;
		
		for (Elevator e : elevators) {
			int distance = Math.abs(e.getCurrentFloor() - floor);
			if (distance < minDistance) {
				minDistance = distance;
				best = e;
			}
		}
		return best;
	}
	
	void stepAll() {
		for (Elevator e : elevators) {
			e.step();
		}
	}
}
