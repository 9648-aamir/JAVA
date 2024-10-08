package Initialization_of_method;

public class Driver {

	public static void main(String[] args) {

	Student s=new Student();
	s.setValue("Aamir",102,"CSE");
	s.getDetails();
	System.out.println("======================");
	
	Laptop lap=new Laptop();
	lap.setValue("Mi", "Intel i 5", 4 );
	lap.getDetail();
	System.out.println("======================");
	
	
	Vehicle v=new Vehicle();
	v.setValue("Mahendra","SUV",2019);
	v.getDetail();
	System.out.println("======================");
	}
}
