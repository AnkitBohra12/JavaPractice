package oopsConcepts;

class Insurance{
	double premium() {
		return 5;
	}
}

class ICICI extends Insurance{
	double premium() {
		return 12.76;
	}
}

class Bajaj extends Insurance{
	double premium() {
		return 8.5;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Insurance ins = new Insurance();
		System.out.println(ins.premium());
		
		ICICI ic = new ICICI();
		System.out.println(ic.premium());
		
		Bajaj ba = new Bajaj();
		System.out.println(ba.premium());
		
	}
}
