package fruit;

public class Fruit {
private String name;
private String color;
private double weight;
private boolean isRipe;

public String getName() {
	//validation
	
	return name;
}

public String getcolor() {
	//validation
	
	return color;
}

public double getWeight() {
	//validation
	
	return weight;
}

public boolean getIsRipe() {
	//validation
	
	return isRipe; 
}

public void setName(String name) {
	this.name=name;
}

public void setColor(String color) {
	this.color=color;
}

public void setWeight(double weight) {
	this.weight=weight;
}

public void setIsRipe(boolean isRipe) {
	this.isRipe=isRipe;
}
}
