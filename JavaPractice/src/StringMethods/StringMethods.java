package StringMethods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		// declartion
		
		String str = "Welcome";
		String st = new String("Selenium");
		System.out.println(str+ "\t" +st);
		
		
		// length ----> returnr length of the string(no of charcters)
		
		int len = str.length();
		System.out.println(len);
		System.out.println(str.length());
		System.out.println("welcome".length());
		
		// concat() ----> Joining strings
		
		str = "Hello";
		String str1 = "Selenium";
		String str2 = "My cypress";
		System.out.println(str + str1);
		System.out.println(str.concat(str1).concat(str2));
		
		
		// trim() ---> Remove spaces from right and left side , returns string
		
		str1 = "   welcome   to  india   ";
		System.out.println(str1.trim());
		System.out.println(str1.length());
		System.out.println(str1.trim());
		System.out.println(str1.trim().length());
		
		
		// charAT ---> return a charcter from the string based on index, return charcter
		
		str2 = "Java and Selenium";
		System.out.println(str2.charAt(2));		// v
		System.out.println(str2.charAt(5));		// a
		System.out.println(str2.charAt(10));	// e
		
		
		// contains() ---> returns boolean, tells whether string is part of main string or not 
		
		System.out.println(str2.contains("and"));
		System.out.println("ava");
		System.out.println(" ");
		
		
		// CharArray ---> convert string to char array, return char array
		
		str1 = "delhi NCR";
		char arr[] = str1.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		
		// equals(), equalsIgnoreCase()  ---->  compare strings
		str2 = "Delhi ncr";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("deLhi Ncr"));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		// replace()  ---->  replace sequence of charcters with another sequence in sa string
		
		str1 = "Welcome to Selenium java and Selenium Python";
		System.out.println(str1.replace('e', 't'));
		
		// subString() -----> extract substring from yhe main string
		// starting index starts with 0  and ending index with 1
		String st2 = "welcome to selenium";
		System.out.println(st2.substring(3,7));
		
		
		// toUpperCase, toLowerCase
		System.out.println(st2.toLowerCase());
		System.out.println(st2.toUpperCase());
		
		// split()	--------	splits string into multiple parts based on delimeter
		
		str2 = "abc@pqr@xyz@aol.com";		
		String ar[]= str2.split("@");
		System.out.println(Arrays.toString(ar));

	} 

}
