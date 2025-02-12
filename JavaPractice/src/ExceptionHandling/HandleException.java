package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		
		System.out.println("Program starts .....");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		try {
			int num = sc.nextInt();		// InputMismatchException
			System.out.println(num);
		} catch (InputMismatchException obj) 
		{
			System.out.println(obj.getMessage());
		}
	}
}
