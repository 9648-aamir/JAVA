package Inheritance;

public class Car extends Vehicle {
int p=45;
int q=30;

//Car(){
//	System.out.println("This is car without-using super");
//}

//Car(){
////	super();
//	System.out.println("This is car no-arg using super");
//}

Car(){
	super(2);
	System.out.println("This is car no-arg statement");
}

Car(int g){
	super(23);
	System.out.println("This is car arg statement");
}
}
