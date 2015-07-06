package elevator;

public class Demo_elevator {

	public static void main(String[] args) {
		
		Elevator e1 = new Elevator();
		Building b = new Building(e1,10); 
				
		//Request of Service where (Current Floor) and (Destination Floor) is Provided
		b.serviceRequest(3,0);
		//b.serviceRequest(0,0);
		//b.serviceRequest(1,2);
		//b.serviceRequest(5,0);
	}

}
