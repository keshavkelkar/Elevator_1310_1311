package elevator;

public class Elevator {

	String direction;
	Integer current_floor;
	
	Elevator(Integer curr){
		this.current_floor=curr;
		System.out.println("Current floor : " + this.current_floor);
	}
	
	public void currentFloor(){
		System.out.println("Current floor : " + this.current_floor);
	}
	
	public void setCurrentFloor(Integer curr){
		this.current_floor=curr;
		this.currentFloor();
	}
}
