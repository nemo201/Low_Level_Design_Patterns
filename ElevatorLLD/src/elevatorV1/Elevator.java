package elevatorV1;

import java.util.Collections;
import java.util.PriorityQueue;

public class Elevator {
	private int id;
	private int currentFloor;
	private ElevatorState state = ElevatorState.IDLE;
	private Direction direction = Direction.UP;
	
	private PriorityQueue<Integer> upQueue = new PriorityQueue<>();
	private PriorityQueue<Integer> downQueue = new PriorityQueue<>(Collections.reverseOrder());
	
	private Door door = new Door();
	
	Elevator(int id) {
		this.id = id;
		this.currentFloor = 0; // assuming ground floor as starting point
	}
	
	public void addRequest(int floor) {
		if (floor > currentFloor) {
			upQueue.offer(floor);
		} else if (floor < currentFloor) {
			downQueue.offer(floor);
		}
	}
	
	public void step() {
		if (state == ElevatorState.IDLE) {
			if (!upQueue.isEmpty()) {
				direction = Direction.UP;
				state = ElevatorState.MOVING;
			} else if (!downQueue.isEmpty()) {
				direction = Direction.DOWN;
				state = ElevatorState.MOVING;
			}
		}
		
		if (state == ElevatorState.MOVING) {
			moveOneFloor();
			processStop();
		}
	}

	private void processStop() {
		if (direction == direction.UP && !upQueue.isEmpty() && currentFloor == upQueue.peek()) {
			upQueue.poll();
			stop();
		}
		if (direction == direction.DOWN && !downQueue.isEmpty() && currentFloor == downQueue.peek()) {
			downQueue.poll();
			stop();
		}
	}

	private void stop() {
		state = ElevatorState.STOPPED;
		door.open();
		door.close();
		state = ElevatorState.IDLE;
	}

	private void moveOneFloor() {
		currentFloor += (direction == Direction.UP) ? 1 : -1;
		System.out.println("Elevator " + id + " moved to floor " + currentFloor);
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public boolean isIdle() {
		return state == ElevatorState.IDLE;
	}
}
