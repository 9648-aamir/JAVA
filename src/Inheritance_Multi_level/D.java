package Inheritance_Multi_level;

public class D extends C {
	int x=60;
	int d=48;
    
	public void test() {
		int x=70;
		int e=80;
		
		System.out.println("E is:"+e);
		System.out.println("D is:"+d);
		System.out.println("C is:"+c);
		System.out.println("B is:"+b);
		System.out.println("A is:"+a);
		System.out.println("Local x is:"+x);
		System.out.println("non-static x of D is:"+this.x);
		System.out.println("non-static x of C is:"+super.x);
		System.out.println("non-static x of B is:"+getXofB());
		System.out.println("nono-static x of A is:"+getXofA());
	}

}
