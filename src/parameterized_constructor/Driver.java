package parameterized_constructor;

public class Driver {
public static void main(String[] args) {
	Employ e1=new Employ("Aamir");
	Employ e2=new Employ("Aamir",101,299900.98,"Lucknow");
	Employ e3=new Employ("Aamir",102);
	Employ e4=new Employ("Aamir",103,234000.098);
	Employ e5=new Employ();
	
	e1.detailsEmp();
	e2.detailsEmp();
	e3.detailsEmp();
	e4.detailsEmp();
	e5.detailsEmp();
	
	System.out.println("Total obect is created is:"+Employ.count);
}
}
