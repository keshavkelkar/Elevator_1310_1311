package elevator;

public class ElevatorDemo {

	public static void main(String[] args) {
		Elevator e = new Elevator(5);
		Controller c = new Controller(e);
		//c.startElevator(5,9);
		c.startElevator(5,2);
		
	}

}
