package Initialization_of_method;

public class Student {
String name;
int rollNumber;
String course;

public void setValue(String name, int roolNumber, String course) {
	this.name=name;
	this.rollNumber=rollNumber;
	this.course=course;
}

public void getDetails() {
	System.out.println("======================");
	System.out.println("||"+"Name is:"+name+"       ||");
	System.out.println("||"+"RollNumber is:"+rollNumber+"     ||");
	System.out.println("||"+"Cpurse is:"+course+"       ||");
}
}
