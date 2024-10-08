package Copy_contruction;

public class DriverFruit {
	
public static void main(String[] args) {

Fruit f1=new Fruit("Mango",120,2.3);
Fruit f2=new Fruit("Banana",140,2.3);
Fruit f3=new Fruit("Orange",150,2.3);
Fruit f4=new Fruit("Grapes",100,2.3);
Fruit f5=new Fruit("Apple",110,2.3);
Fruit f6=new Fruit(f1);
Fruit f7=new Fruit(f1,f2,f3);

f1.getDetail();
f2.getDetail();
f3.getDetail();
f4.getDetail();
f5.getDetail();
f6.getDetail();
f7.getDetail();
}

}
