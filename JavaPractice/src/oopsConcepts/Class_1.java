package oopsConcepts;

public class Class_1 extends Class_2 implements Interface_1, Interface_2{
	
	public void m1() {
		System.out.println(a);
	}
	
	public void m2() {
		System.out.println(b);
		
	}
	public static void main (String args[]) {
		
		Class_1 obj1 = new Class_1();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		
	}

}
