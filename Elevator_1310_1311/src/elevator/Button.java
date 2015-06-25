package elevator;

public class Button {

	String pressed;
	
	Button(){
		this.pressed="false";
	}
	
	public void pressButton(){
		this.pressed="true";
		this.getButtonStatus();
	}
	
	public void resetButton(){
		this.pressed="false";
		this.getButtonStatus();
	}
	
	public void getButtonStatus(){
		System.out.println("Button pressed : " + this.pressed);
	}
	
}
