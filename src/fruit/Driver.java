package fruit;

public class Driver {
public static void main(String[] args) {
	Fruit f1=new Fruit();
	f1.setName("Mango");
	f1.setColor("Yellow");
	f1.setWeight(2.5);
	f1.setIsRipe(true);
	
    System.out.println("Name is:"+f1.getName());	
    System.out.println("Name is:"+f1.getcolor());	
    System.out.println("Name is:"+f1.getWeight());	
    System.out.println("Name is:"+f1.getIsRipe());		
	
}
}
