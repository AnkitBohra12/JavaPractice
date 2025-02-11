package StringMethods;

import java.util.Arrays;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String str = "#123&23$768";			// 123 23 768
		System.out.println(str.replace("#", "").replace("&", "").replace("$", ""));
		
		
		str = "xyz,pqr@def,abc";	// xyz pqr def abc
		String arr[] = str.split(",");
		System.out.println(Arrays.toString(arr));
		
		String brr[] = arr[1].split("@");  // add both arrays
		System.out.println(Arrays.toString(brr));
		
		// * % ^ & ( )
		
		str = "Mike Luther";
		System.out.println(str.contains("luther"));
		System.out.println(str.toLowerCase().contains("luther"));
		System.out.println(str.replace("L","l").contains("luther"));
		
		
	}	

}
