package Abstract;

public class SamsungPhoneFactory  extends Phone{
	
	String phonemodel;
	

	
	public SamsungPhoneFactory(String phonemodel) {
		this.phonemodel=phonemodel; 
	}
	
	
    public int getCost() {	
    
		if(phonemodel.equals("s22")) {
			return 100;
		}else if(phonemodel.equals("s23")) {
			return 115;
		}else if (phonemodel.equals("s24")) {
			return 150;
		}else {
			return -1;
		}

}
}
