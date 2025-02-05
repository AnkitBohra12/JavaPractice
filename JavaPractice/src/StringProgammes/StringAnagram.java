package StringProgammes;

import java.util.Arrays;

//  WJP for given strings are anagram or not str1 = "tomato", str2 = "motato"


//													By using sorting
//************************************************ By using Arrays and functions ***************************************

public class StringAnagram {

		static boolean anagram(String s1, String s2) {
			
			 // Sort both strings
	        char[] s1Array = s1.toCharArray();
	        char[] s2Array = s2.toCharArray();
	        Arrays.sort(s1Array);
	        Arrays.sort(s2Array);

	        // Compare sorted strings
	        return Arrays.equals(s1Array, s2Array);
	    }

	    public static void main(String[] args) {
	        String s1 = "tomato";
	        String s2 = "omatot";
	        System.out.println(anagram(s1, s2));
	        System.out.println("******************** 2nd way ***********************");
	        
//********************************* Simple by Array OR if statement *************************
	        
	        String s = "lol lol";
	        String f = "lal lol";
	        
//	        Removing all the spaces form the both Strings
	        
	        System.out.println(s.replaceAll("\\s",""));
	        System.out.println(f.replaceAll("\\s",""));
	        
//	        First we will check if both string have the same number of words or characters
	        
	        if(s.length() != f.length()) {
	        	System.out.println("The strings are not anagrams.");
	        	return ;
	        } 	
	        
//	        convert these string into array and sort them
	        
	        char[] arr1 = s.toCharArray();
	        char[] arr2 = f.toCharArray();
	        Arrays.sort(arr1);
	        System.out.println(arr1);
	        Arrays.sort(arr2);
	        System.out.println(arr2);
	        
//	        checking the sorted arrays are equal or not
	        
	       if(Arrays.equals(arr1, arr2)) {
	    	   System.out.println("Strings are anagram");
	       }
	       else {
	    	   System.out.println("Not anagram");
	       }
	        
	   }
}





	
