//	Final Keyword
//1) we can use final keyword with variables, methods and classes
//	a) variables : we cannot change the of it (becomes constant)
//	b) methods : we cannot override those methods on child class
//	c) classes : we cannot extend the class 


package oopsConcepts;

final class Test{
	final int x = 100;
	
	final void t() {
		System.out.println("This is t method in Test");
	}
}

class Test_child extends Test{			// cannot extend the final clas
	void t() {
		System.out.println("This is t method in Test Child");
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		
	Test test = new Test();
	test.x = 200;			// can't change the value of variable
	
	}
}
