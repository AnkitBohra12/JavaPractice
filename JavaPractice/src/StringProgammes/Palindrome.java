package StringProgammes;

// WJP to find the given String is palindrome or not

public class Palindrome {

//	public static void main(String[] args) {
//		String s = "ankit";
//		
		
//		By StringBuilder and Same as StringBuffer we can do but prefer Builder over Buffer
//		StringBuilder sb = new StringBuilder(s);
//		
//		StringBuilder rev = sb.reverse();
//		System.out.println(rev);
//		
//		System.out.println(s.contentEquals(rev));
		

//		Way 2 : By for loop ig
		
//		String reverse = "";
//		
//		char ch;
//		
//		for(int i=0; i<s.length();i++) {
//			
//			ch = s.charAt(i);
//			reverse = ch+reverse;
//			
//			System.out.println(reverse);
//		}
		
		
		
		
		
		    // Function to reverse a string using StringBuilder
		    public static String reverseString(String str) {
		        // Create a StringBuilder object with the given string
		        StringBuilder sb = new StringBuilder(str);
		        
		        // Reverse the string and return it
		        return sb.reverse().toString();
		    }

		    public static void main(String[] args) {
		        String str = "Hello World";

		        // Call the reverseString function
		        String reversed = reverseString(str);

		        // Print the reversed string
		        System.out.println("Original String: " + str);
		        System.out.println("Reversed String: " + reversed);
		    }
		
	}



