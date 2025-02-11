package StringMethods;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Welcome to Java";
		String rev = "";
		
//		for(int i=str.length()-1; i>=0; i--) {			
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
		
		char arr[] = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + arr[i];
		}
		System.out.println(rev);
		
		StringBuffer str1 = new StringBuffer("Selenium");
		System.out.println(str1.reverse());
		
		StringBuilder str2 = new StringBuilder("Welcome");
		System.out.println(str2.reverse());
		

	}
}
