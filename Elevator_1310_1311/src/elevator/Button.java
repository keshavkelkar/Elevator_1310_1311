package elevator;

public class Button {

	String buttonStatus;
	
	Button(){
		this.buttonStatus="reset";
    }

	public String getButtonStatus(){
			return buttonStatus;	
	}
	
	public void setButtonStatus(String buttonStatus){
		this.buttonStatus=buttonStatus;	
	}
	
}
