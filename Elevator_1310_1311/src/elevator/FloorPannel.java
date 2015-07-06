package elevator;

import java.util.ArrayList;

public class FloorPannel {
	
	ArrayList <PannelButton> pb = new ArrayList<PannelButton>();
	
	FloorPannel(Integer total_floors){
		for(Integer i=0;i<total_floors;i++){
			PannelButton pb1 = new PannelButton(i);
			pb.add(pb1);
		}
	}
	
	public void requestFloor(Integer currentFloor,Integer destinationFloor,Elevator e){
		for(Integer i=0;i<pb.size();i++){
			if(pb.get(i).id==destinationFloor){
				pb.get(i).gotoRequestedFloor(currentFloor, destinationFloor, e);
			}
		}
	}
}
