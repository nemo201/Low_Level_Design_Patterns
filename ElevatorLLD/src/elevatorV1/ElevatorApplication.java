package elevatorV1;

public class ElevatorApplication {
	public static void main(String[] args) {
		ElevatorSystem elevatorSystem = new ElevatorSystem(2);
		elevatorSystem.requestElevator(10, Direction.UP);
		elevatorSystem.requestElevator(2, Direction.UP);
		
		for (int i = 0; i < 10; i++) {
			elevatorSystem.step();
		}
	}
}
