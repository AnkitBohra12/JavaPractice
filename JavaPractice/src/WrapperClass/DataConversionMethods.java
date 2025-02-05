package WrapperClass;

public class DataConversionMethods {
	
	// These are the class which make possible to use the premitive 
	// data types as objects.
	// example : Character ch = new Character("welcome");

	public static void main(String[] args) {
		
	// Case 1: String ----> int, double, boolean
		
		String str = "7869";	// only work for numberic not alpha numeric and alphabates
		int str_int = Integer.parseInt(str);
		System.out.println(str_int);
		
		str = "567.8976";
		System.out.println(Double.parseDouble(str));
		
		str = "true";
		System.out.println(Boolean.parseBoolean(str));
		
		// int, double, boolean, char ---> String
		
		int a =20;
		double b = 5478.254;
		char c = 'Y';
		boolean d = false;
		
		String s = String.valueOf(a);	// value of a
		System.out.println(s);
		
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		
	}

}
