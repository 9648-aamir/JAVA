package static_NonStatic_Block;

public class Fruit {
	int fruit=10;
	{
		System.out.println("Non-Static block-1 of fruit class");
	}

	static {
		System.out.println("Static block-1 of fruit class");
	}
	
	static {
		System.out.println("Static block-2 of fruit class");
		
	}
	{
		System.out.println("Non-Static block-1 of fruit class");
	}
	double Fruit=2.2;
}
