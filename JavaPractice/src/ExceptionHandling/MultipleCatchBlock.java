package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Program is started.....");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		int arr[] = new int[5];
		System.out.println("Enter the index");
		int index = sc.nextInt();
		
		System.out.println("Enter the value");
		int value = sc.nextInt();
		
		try {
			arr[index] = value;			// InputMismatchException
			System.out.println(arr[index]);}
		catch(InputMismatchException obj) {
			System.out.println(obj.getMessage());
		} 
		catch(ArithmeticException obj) {		// ArithmeticException
			System.out.println("division with 0 not possible");
			System.out.println(obj.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException obj) {		// ArrayIndexOutOfBoundsException
			System.out.println("Index more than maxium index");
			System.out.println(obj.getMessage());
		}
		
		try {
			String str = sc.next();			// NumberFormatException
			int n = Integer.parseInt(str);
			System.out.println(n);
		}
		catch(Exception obj) {
			System.out.println(obj.getMessage());
		}
		System.out.println("Program is completed.....");
	}

}
