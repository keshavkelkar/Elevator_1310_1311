package elevator;

public class FloorButton extends Button {
	//Calling Elevator to current floor
	public void callElevator(Elevator e1, Integer dest,Integer curr){
		e1.moveElevator(e1.getCurrentFloor(),curr );
		System.out.println("zsdkjbd");
		e1.moveElevator(curr, dest);
	}
}
