package Abstract;

public class Apple extends Phone{

	String phonemodel;
	

	
	public Apple(String phonemodel) {
		this.phonemodel=phonemodel; 
	}
	
	
    public int getCost() {
    	
    
		if(phonemodel.equals("13")) {
			return 100;
		}else if(phonemodel.equals("14")) {
			return 115;
		}else if (phonemodel.equals("15")) {
			return 150;
		}else {
			return -1;
		}

}
	
	
}
