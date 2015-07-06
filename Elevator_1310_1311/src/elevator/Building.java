package elevator;

import java.util.ArrayList;

public class Building {
	Elevator e1 ;
	
	ArrayList <Floor> f = new ArrayList<Floor>();
	
	Building (Elevator e1,Integer totalFloors ){
		this.e1=e1;
		for(Integer i=0;i<totalFloors;i++ ){
			Floor f1=new Floor(i);
			f.add(f1);
		}
	}
	
		
	public void serviceRequest(Integer currentFloor,Integer destinationFloor ){
		if(currentFloor==e1.getCurrentFloor()){
			//System.out.println("zsdkjbd");
			e1.moveElevator(currentFloor, destinationFloor);
		}
		else 
		{
			for(Integer i =0;i<f.size();i++){
				if(f.get(i).id == currentFloor){
					f.get(i).sendRequest(e1,destinationFloor);
				}
			}
		}
	}
}
