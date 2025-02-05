// When one thing can be shown in many forms 
	// Example : water : liquid, vapor, solid
	// tress : mango, apple, bamboo etc 
		
	// in java we achieve poly through overloading
		
	/* 4 rules of polymorphism
		1) Method name should be same(mandatory)
		2) Number of parameters should be different
		3) Data types of parameters should be different
		4) Order of parameters should be different
	 */	

package oopsConcepts;

public class Polymorphism {
	
	int x = 70, y = 80;
	
	void display() {
		System.out.println(x+"\t"+y);
	}

	void display(int a,int b) {
		System.out.println(a+"\t"+b);
	}
	
	void display(int a, double b) {
		System.out.println(a+"\t"+b);
	}
	
	void display(double a, int b) {
		System.out.println(a+"\t"+b);
	}
	
	void display(int a, int b, int c ) {
		System.out.println(a+"\t"+b+ "\t"+c);
	}
}
