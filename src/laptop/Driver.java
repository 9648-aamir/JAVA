package laptop;

public class Driver {
public static void main(String[] args) {
	Laptop l1=new Laptop();
	l1.setBrand("Mi");
	l1.setProcessorSpeed(3.5);
	l1.setRamSize(8);
	l1.setStorageSize(252);
	
	System.out.println("Name is:"+l1.getBrand());
	System.out.println("RamSize is:"+l1.getRamSize()+" GB");
	System.out.println("ProcessorSpeed is:"+l1.getProcessorSpeed()+" GHz");
	System.out.println("StorageSize is:"+l1.getStorageSize()+" GB");
}
}
