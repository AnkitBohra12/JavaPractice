//Super Keyword
//When used with any variable or method will be invoking variable
//or method of immediate parent class


package oopsConcepts;

public class SuperIKeyword {	
	String color = "Red";
	void Running() {
		System.out.println("slow....");
	}
}

class super_child extends SuperIKeyword{
	String color ="orange";
	
	void display() {
		System.out.println(super.color);
	}
	
	void Running() {
		System.out.println("Fast....");
		super.Running();
	}
}

class super_child2 extends super_child{
String color ="Yellow";
	
	void display() {
		System.out.println(super.color);
	}
}
