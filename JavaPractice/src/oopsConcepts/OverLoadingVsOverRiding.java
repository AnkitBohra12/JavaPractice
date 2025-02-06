//		Overriding
//1) possible only in multiple classes (inheritance)
//2) we should not change the signature of method but body can change
//3) Method names are same
//4) belongs to inheritance
//
//		Overloading
//1) possible in single and multiple inheritance
//2) we should change the signature of the method
//3) method name should be same
//4) belongs to polymorphism


package oopsConcepts;

class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int a, int b) {					// Overriding
		System.out.println(a + " " + b);
	}
}

class XYZ extends ABC{
	void m1(int a) {
		System.out.println(a+a);
	}
	
	void m2(int a,int b) {					// Overloading
		System.out.println(a + "  " + b);
	}
}


public class OverLoadingVsOverRiding {

	public static void main(String[] args) {
		
		XYZ obj = new XYZ();
		obj.m1(10);
		obj.m2(30, 45);
		
		
	}

}
