package Facebook;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Login g1=new Login();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name:");
	String n=sc.nextLine();
	g1.setName(n);
	
	Scanner sc1=new Scanner(System.in);
	System.out.print("Enter the Email:");
	String e=sc1.nextLine();
	g1.setEmail(e);
	
	Scanner sc2=new Scanner(System.in);
	System.out.print("Enter DOB:");
	String d=sc2.nextLine();
	g1.setDOB(d);
	
	Scanner sc3=new Scanner(System.in);
	System.out.print("Enter the Address:");
	String add=sc.nextLine();
	g1.setAdd(add);
	
	Scanner sc4=new Scanner(System.in);
	System.out.print("Enter the PIN:");
	int pin=sc4.nextInt();
	g1.setPin(pin);
	
	System.out.println();
	System.out.println("Check Your What you fill, is correct or not");
	System.out.println("Name is:"+g1.getName());
	System.out.println("Email is:"+g1.getEmail());
	System.out.println("Date of Birth is:"+g1.getDOB());
	System.out.println("Address is:"+g1.getAdd());
	System.out.println("Pin number is:"+g1.getPin());
}
}
