package StringProgammes;

import java.math.BigInteger;

public class RemoveZeros {

	public static void main(String[] args) {
		
//		WJP to Remove leading zeros
		
//		String s = "00000111";
//		String s1 = "";
//		
//		int ind = 0;
//		
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			
//			if(ch!=0) {
//				ind = i;
//				break;
//			}
//		}
//		s1 = s.substring(ind, s.length());
//		System.out.println(s1);
//		
		 // Sample string input
        String str = "00000123569";
        String newstr = "";
        int ind = 0;
        for (int i = 0; i < str.length(); i++) {
            char p = str.charAt(i);
            if (p != '0') {
                ind = i;
                break;
            }
        }
        newstr = str.substring(ind, str.length());
        // Printing leading zeros inside string
        System.out.println(newstr);
        
        
        
//********************************* By using replaceFirst() method **********************************
        
 String numWithoutZeros = str.replaceFirst("0+", "");
        
        // Handle case where the string is all zeros
        if (numWithoutZeros.isEmpty()) {
            numWithoutZeros = "0"; // to avoid empty string if the number is all zeros
        }
        
        System.out.println(numWithoutZeros); // 
        
        
//********************************** Integer.parseInt() **********************************
        
     // Convert to integer, automatically removing leading zeros
        int numWithoutZero = Integer.parseInt(str);
        
        System.out.println(numWithoutZero);
        
        
//********************************* BigInteger *********************************************
        
        // Use BigInteger to parse and remove leading zeros
        BigInteger bigInt = new BigInteger(str);
        
        // Print the result as a string
        System.out.println(bigInt.toString());
        
	}

}
