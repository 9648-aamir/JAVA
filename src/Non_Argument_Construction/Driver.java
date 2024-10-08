package Non_Argument_Construction;

public class Driver {

	public static void main(String[] args)
	{
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();
		Employ e4=new Employ();
		Employ e5=new Employ();
		Employ e6=new Employ();
		System.out.println("Total Object created is: "+Employ.count);
	}
}
