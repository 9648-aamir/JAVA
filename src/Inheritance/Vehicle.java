package Inheritance;

public class Vehicle {
int x=10;
int y=20;

//Vehicle(){
//	System.out.println("This is vehicle no-arg statement");
//}

Vehicle(){
	super();
	System.out.println("This is vehicle no-arg statement using super");
}

Vehicle(int x){
	System.out.println("This is vehicle arg statement");
}
}
