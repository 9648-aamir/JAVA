package Initialization_of_method;

public class Vehicle {
String made;
String model;
int year;

public void setValue(String made, String model, int year) {
	this.made=made;
	this.model=model;
	this.year=year;
}
public void getDetail() {
	System.out.println("Made By:"+made);
	System.out.println("Model is:"+model);
	System.out.println("Year is:"+year);
}
}
