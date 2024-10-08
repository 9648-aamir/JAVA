package object_loading;

public class Driver {
	public static void main(String[] args)
	{
		System.out.println("EmployDriver main() starts");
		System.out.println("COmpany Name is: "+Employ.comp_name);
		Employ.giveBiometric();
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();
		e2.comp_name="Ship Company";
		e2.name="John";
		System.out.println("=======Employ1 Details=======");
		System.out.println("Employ1 Object address is: "+e1);
		System.out.println("Employ1 Company Name is: "+e1.comp_name);
		System.out.println("Employ1 Name is: "+e1.name);
		System.out.println("Employ1 ID is: "+e1.id);
		e1.giveBiometric();
		e1.work();
		System.out.println("=======Employ2 Details=======");
		System.out.println("Employ2 Object address is: "+e2);
		System.out.println("Employ2 Company Name is: "+e2.comp_name);
		System.out.println("Employ2 Name is: "+e2.name);
		System.out.println("Employ2 ID is: "+e2.id);
		e2.giveBiometric();
		e2.work();
		System.out.println("=======Employ3 Details=======");
		System.out.println("Employ3 Object address is: "+e3);
		System.out.println("Employ3 Company Name is: "+e3.comp_name);
		System.out.println("Employ3 Name is: "+e3.name);
		System.out.println("Employ3 ID is: "+e3.id);
		e3.giveBiometric();
		e3.work();


		

	}

}
