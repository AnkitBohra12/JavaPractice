package StringMethods;

public class StringComparison {

	public static void main(String[] args) {
		
		// Case 1 
		
		String s1 = "Selenium";
		String s2 = "Selenium";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		// Case 2 
		
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		System.out.println(s3 == s4);	// comparing the objects
		System.out.println(s3.equals(s4));		// comparing the content
		
		// Case 3
		
		String s5 = "Selenium";
		String s6 = new String("Selenium");
		
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
	}

}
