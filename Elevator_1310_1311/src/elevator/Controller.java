package elevator;

public class Controller {

	public static final Integer max_capacity = 6, max_floor = 5;
	Elevator e;
	Door d = new Door();
	Button b = new Button();
	Integer capacity;
	Controller(Elevator e){
		this.e=e;
	}
	public void startElevator(Integer ppl,Integer dest){
        if (ppl > max_capacity){
			System.out.println("Max no. of people exceeded. Max capacity : 5 people.");
        }else{
			this.capacity=ppl;
			move(dest);
		}
	}
	public void move(int dest){
		if(dest > max_floor){
			System.out.println("Invalid floor!! Max floors : 5");
		}
		else if(dest > e.current_floor){
			b.pressButton();
			d.closeDoor();
			System.out.println("Moving Up." );
			for(Integer i = e.current_floor ; i <= dest ; i++){
				e.setCurrentFloor(i);
			}
			halt();
		}
		else if(dest < e.current_floor){
			b.pressButton();
			d.closeDoor();
			System.out.println("Moving Down.");
			for(Integer i = e.current_floor ; i >= dest ; i--){
				e.setCurrentFloor(i);
			}
			halt();
		}
		else{
			System.out.println("Destination same as current floor.");
		}
	}
	
	
	public void halt(){
		System.out.println("Halt!!");
		d.openDoor();
		b.resetButton();
	}
}
