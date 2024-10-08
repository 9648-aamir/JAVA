package static_NonStatic_Block;

public class Mango extends Fruit{
	String m="mango1";
{
System.out.println("Non-Static Block-1 of mango class");
}
	
static {
System.out.println("Static Block-1 of mango class");
}

static{
System.out.println("Static Block-2 of mango class");
}

{
System.out.println("Non-Static Block-2 of mango class");
}

String m2="mango2";
}
