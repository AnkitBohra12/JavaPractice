package NormalProgrammes;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number to find Even or Odd : ");
//		String in = sc.nextLine();
		
		int sc = 5;
		String res = (sc % 2 == 0)?"Even":"Odd";
		System.out.println(res);
		
	}

}
