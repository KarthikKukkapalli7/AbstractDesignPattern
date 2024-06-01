package Abstract;

public class Main {
	
	public static void main(String[] args) {
		PhoneTypeFactory phone = new PhoneTypeFactory("Apple","13");
		phone.getPhoneFactory();
		System.out.println(phone.getCost());
		
		
		
	}

}
