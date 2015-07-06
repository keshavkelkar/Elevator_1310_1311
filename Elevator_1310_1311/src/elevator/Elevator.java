package elevator;

public class Elevator {
	
	Door ed = new Door();
	FloorPannel fp = new FloorPannel(10);
	Floor curFlr ;
	
	String elevatorStatus;
	Integer currentFloor;
	
	Elevator(){
		elevatorStatus="static"; //static or moving
		currentFloor=0; 
	}
	
	public String getElevatorStatus(){
		return elevatorStatus;
	}
	
	public void setElevatorStatus(String elevatorStatus){
		this.elevatorStatus=elevatorStatus;
	}
	
	public Integer getCurrentFloor(){
		return currentFloor;
	}
	
	public void setCurrentFloor(Floor curFlr){
		this.currentFloor=curFlr.getFloorNumber();
	}
	
	public void closeElevDoor(){		
		  ed.setDoorStatus("close");
		  System.out.println("Elevator door " + ed.getDoorStatus());
	}
	
	public void moveElevator(Integer currentFloor,Integer destinationFloor){
		if(this.elevatorStatus.equalsIgnoreCase("static")){
		  this.elevatorStatus="moving";
		  fp.requestFloor(currentFloor,destinationFloor,this);
		  ed.setDoorStatus("open");
		  System.out.println("Elevator door " + ed.getDoorStatus());
		  System.out.println("	=> Enter In/Move Out =>");
		  ed.setDoorStatus("close");
		  System.out.println("Elevator door " + ed.getDoorStatus());
		}
		else{
			System.out.println("Elevator is busy. Please wait.");
		}
		this.elevatorStatus="static";
	}
	
	public void moveUP(Integer currentFloor,Integer destinationFloor){
		for(Integer i = currentFloor ; i<=destinationFloor; i++){
		curFlr= new Floor(i);
		setCurrentFloor(curFlr);			
		System.out.println("	=> Floor "+getCurrentFloor()+ " <=");
		}
	}
	
	public void moveDown(Integer currentFloor,Integer destinationFloor){
		for(Integer i = currentFloor ; i>=destinationFloor; i--){
		curFlr= new Floor(i);
		setCurrentFloor(curFlr);
		System.out.println("	=> Floor "+getCurrentFloor() + " <=");
		}
	}
}
