package elevator;

public class Door {
	public String doorStatus;
    
	//Initializing doorStatus in constructor
	Door(){
		doorStatus="close";
	}
	
	//Getting doorStatus
	public String getDoorStatus(){
		
		return doorStatus;
	}
	
	//Setting doorStatus
	public void setDoorStatus(String doorStatus){
		
		this.doorStatus = doorStatus;
	}
	
}
