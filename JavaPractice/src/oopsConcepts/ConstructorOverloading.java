package oopsConcepts;

public class ConstructorOverloading {
	
	double a,b,c;
	
	ConstructorOverloading(){
		a = 90;
		b = 78;
		c = 54;
	}
	
	ConstructorOverloading(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	ConstructorOverloading(double x){
		a=b=c=x;
	}
	
	void display() {
		System.out.println(a+ "		" +b+"		"+c);
	}

}
