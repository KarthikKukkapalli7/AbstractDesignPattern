package Abstract;


public  class PhoneTypeFactory extends Phone{
	
	String phonetype;
	String phonemodel;
	Phone phone=null;
	
     public PhoneTypeFactory(String phonetype, String phonemodel) {
		
    	 this.phonetype=phonetype;
    	 this.phonemodel=phonemodel;
    	 
	}
     
	public int getCost() {
		System.out.println(phone);
		return (phone.getCost());
	}
	
	public void getPhoneFactory() {
		
		
		if(phonetype.equals("samsung")) {
			SamsungPhoneFactory phone = new SamsungPhoneFactory(phonemodel);
			
			this.phone=phone;
		}
		else
		{
			
			Apple phone = new Apple(phonemodel);
			
			this.phone=phone;
			System.out.print(this.phone);
			
		}
	}



	
	
}
