// An interface is a blue print of class 
// Interface contains final and static variables
// Interface conatins abstract methds(default and static method are also allowed after jave8)
// An abstract method is method that contains signature but not body(un-implemented methods)
// Methods in interface are public 
// Interface supports concept of multiple and hybrid inheritance
// we can define interface with interface keyword
// An interface is implemented by a class

// class 1 ---- extends ---- class 2
// interface 1 ---- extends --- interface 2
// interface ---- implements ---- class
// class ----- not possible	---- interface // in valid
// can an interface implement a class => Not possible

// We can create object reference for interface but we cannot instantiate it 



package oopsConcepts;

interface Test{
	int length = 20;
	int width = 30;
	
	void circle();		// abstract method
	
	default void square() {
		System.out.println("This is square ---- default method");
	}
	
	static void rectange() {
		System.out.println("This is rectangle---- static method");
	}
}

public class Interface implements Test{

	public void circle() {
		System.out.println("This is circle ---- abstract method");
		
	}
	
	void triangle() {
		System.out.println("This is triangle -- class method");
	}
	
	public static void main(String []args) {
		Interface objc = new Interface();
		objc.circle();
		objc.square();
		objc.triangle(); // only called by class object not by Test(interface)
		
		Test.rectange();
		
		Test objt = new Interface();
		objt.circle();
		objt.square();
		
		Test.rectange();
		System.out.println(Test.length+"\t"+Test.width);
		
	}
}
