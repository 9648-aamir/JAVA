package Copy_contruction;

public class Fruit {
String name;
int price;
double weight;

Fruit(){
	
}

Fruit(String name, int price, double weight){
	this.name=name;
	this.price=price;
	this.weight=weight;
	
}

Fruit(Fruit p){
	this(p.name, p.price, p.weight);
}
Fruit(Fruit p, Fruit k, Fruit l){
	this(p.name, k.price, l.weight);
}

public void getDetail() {
	System.out.println("Name is:"+this.name);
	System.out.println("Price is:"+this.price);
	System.out.println("Weight is:"+this.weight);
	System.out.println("=====================");
}
}
