package StringProgammes;

import java.util.Scanner;
import java.util.StringTokenizer;

// WJP to count the number of words in a string

public class CountNoOfWords {

	public static void main(String[] args) {
			
		String s = "This is the java programme";
		
		String[] word = s.trim().split("\\s");
		
		int count = word.length;
		
		System.out.println(count);
		
		
//		Way 2:- By Tokenizer
		
		StringTokenizer tokenizer = new StringTokenizer(s);
		int wordCount = tokenizer.countTokens();
		
		System.out.println("Counted by word tokenizer = " + wordCount);
		
		
//		Way 3:- By Scanner class
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter string : ");
		String in = s1.nextLine();
		
		int c = 0;
		
		Scanner sc = new Scanner(in);
		
		while(sc.hasNext()) {
			sc.next();
			c++;
		}
		
		sc.close();
		s1.close();
		System.out.println(c);
		
	}

}
