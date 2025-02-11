package StringMethods;

public class ImmutableVsMutable {

	public static void main(String[] args) {
//		Immutable ----> can't change ----> String
//		Mutable ---> Can change ----> StrinBuilder and StringBuffer
		
//		Immutable
		
		String str = "welcome";
		System.out.println(str);
		str.concat("to java");
		System.out.println(str);
		
		// Mutable
		StringBuffer str2 = new StringBuffer("Selenium");
		System.out.println(str2);
		str2.append(" is automation tool");
		System.out.println(str2);

	}

}
