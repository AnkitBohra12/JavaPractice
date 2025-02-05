package oopsConcepts;

public class ConstructorOverloadingMain {

	public static void main(String[] args) {
		
		ConstructorOverloading cod = new ConstructorOverloading(65);
		cod.display();
		
		ConstructorOverloading cod1 = new ConstructorOverloading(50.5,40.5,30.5);
		cod1.display();
		
		ConstructorOverloading cod2 = new ConstructorOverloading();
		cod2.display();
	}

}
