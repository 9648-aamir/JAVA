package Non_Static_and_Static;

public class Fruit {
static int x=2;
int y=4;

public static void test() {
	System.out.println("This is static test method");
	
	//static variable use directly inside static method
	System.out.println("X is directly call:"+x);
	
	//static variable also call by reference class
	System.out.println("X is call by class by reference");
	System.out.println("============================");
	demo();
	System.out.println();
	System.out.println("============================");
	
	//non-static method call by object reference
	Fruit f1=new Fruit();
	f1.drive();
	System.out.println("============================");
}
public static void demo() {
	System.out.print("This is static demo method");
	
//	System.out.println("============================");
}
public void start() {
	System.out.println("This is non-static start method");
	
	//non-static variable directly inside non-static method
	System.out.println("Y is directly call:"+y);
	
	/*static variable also directly call in non-static method 
	 because static variable with all object in heap area of class.
	*/
	System.out.println("X is static varible directly calling inside non-static method:"+x);
	System.out.println("============================");
	
	//static method directly call inside non-static method
	demo();
	System.out.print(" directly inside non-static");
	System.out.println("============================");
}
public void drive() {
	System.out.println("This is non-static method drive");
	System.out.println("============================");
	System.out.println();
}
public static void main(String[] args) {
	System.out.println("This is main method");
	test();
	
	Fruit f1=new Fruit();
	f1.start();
}
}
