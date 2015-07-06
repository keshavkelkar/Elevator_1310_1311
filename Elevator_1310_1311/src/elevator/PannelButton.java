package elevator;

public class PannelButton extends Button {

	Integer id;
	PannelButton(Integer id){
		this.id=id;
	}
	
	public Integer getButtonId(){
		return id;
	}
	
	public void gotoRequestedFloor(Integer currentFloor,Integer destinationFloor,Elevator e){
		System.out.println("Elevator is moving to floor " + this.id);
		if(currentFloor>destinationFloor){
	    	e.moveDown(currentFloor,destinationFloor);
		}
		else if (currentFloor<destinationFloor){
			e.moveUP(currentFloor,destinationFloor);
		}
		else {
			System.out.println("You are on same floor");
		}
	}
}
