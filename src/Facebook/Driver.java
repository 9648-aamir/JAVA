package Facebook;

public class Driver {
public static void main(String[] args) {
	Login g1=new Login();
	g1.setName("Aamir");
	
	g1.setEmail("aamir9648770208gmail.com");
	
	g1.setDOB("05-08-2001");
	
	g1.setAdd("75-lane no. 5 adil nagar, jagrani, Lucknow, UP");
	
	g1.setPin(206022);
	
	System.out.println("Name is:"+g1.getName());
	System.out.println("Email is:"+g1.getEmail());
	System.out.println("Date of Birth is:"+g1.getDOB());
	System.out.println("Address is:"+g1.getAdd());
	System.out.println("Pin number is:"+g1.getPin());
}
}
