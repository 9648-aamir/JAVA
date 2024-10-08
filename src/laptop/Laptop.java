package laptop;

public class Laptop {
private String brand;
private int ramSize;
private double processorSpeed;
private int storageSize;

public String getBrand() {
	//validation
	
	return brand;
}

public int getRamSize() {
	//validation
	
	return ramSize;
}

public double getProcessorSpeed() {
	//validation
	
	return processorSpeed;
}

public int getStorageSize() {
	//validation
	
	return storageSize;
}

public void setBrand(String brand) {
	this.brand=brand;
}

public void setRamSize(int ramSize) {
	this.ramSize=ramSize;
}

public void setProcessorSpeed(double processorSpeed) {
	this.processorSpeed=processorSpeed;
}

public void setStorageSize(int storageSize) {
	this.storageSize=storageSize;
}
}
