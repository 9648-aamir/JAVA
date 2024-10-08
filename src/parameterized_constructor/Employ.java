package parameterized_constructor;

public class Employ {
String name;
int id;
double salary;
String address;

static int count=0;
Employ(){
	System.out.println("Employ object is created");
	count++;
}

Employ(String name){
	this();
	this.name=name;
}
Employ(String name, int id){
	this(name);
	this.id=id;
}
Employ(String name, int id, double salary){
	this(name,id);
	this.salary=salary;
}
Employ(String name,int id, double salary, String address){
	this(name,id,salary);
	this.address=address;
}
public void detailsEmp() {
	System.out.println("Name is:"+this.name);
	System.out.println("ID is:"+this.id);
	System.out.println("Salary is:"+this.salary);
	System.out.println("Address is:"+this.address);
	System.out.println("========================");
}
}
