package Initialization_of_method;

public class Laptop {
String name;
String processor;
int ramSize;

public void setValue(String name, String processor, int ramSize) {
	this.name=name;
	this.processor=processor;
	this.ramSize=ramSize;
}

public void getDetail() {
	System.out.println("Name is:"+name);
	System.out.println("Processor is:"+processor);
	System.out.println("Ram Size is:"+ramSize);
}
}
