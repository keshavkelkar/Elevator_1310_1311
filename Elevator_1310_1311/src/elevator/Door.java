package elevator;

public class Door {

	String status; // either open or close
	
	Door(){
		this.status="close";
	}
	public void openDoor(){
		System.out.println("Open Door.");
		this.status="open";
	}
	
	public void closeDoor(){
		System.out.println("Close Door.");
		this.status="close";
	}
	
	public String getDoorStatus(){
		return this.status;
	}
}
