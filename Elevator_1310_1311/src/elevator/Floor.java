package elevator;

public class Floor {
	Door fd = new Door();
	FloorButton fb = new FloorButton();
	Integer id;
	
	Floor(Integer id){
		this.id=id;
	}
	
	public Integer getFloorNumber(){
		return id;
	}
	
	public void sendRequest(Elevator e1, Integer dest){
		System.out.println("Please wait while the elevator reaches floor " + this.id);
		fb.callElevator(e1,dest,this.id);
	}
}
