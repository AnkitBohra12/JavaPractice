package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
//		An event which causes a program termination is called excpetion.
		
//		Errors:
//		Syntax error : Any mismatch with the pre-defined set of rules for the java code are called syntax error.
//		Logical error : When syntactically the code is correct but if any input is entered there is some issue. The logical error comes.
		
//		2 Types of excpetions
//		Checked Exception : Those exceptions which can be identified by the java compiler. (compile-time exceptions)
//		Unchecked Exceptions : Those exceptions which are not identified by the jave compliler. (runtime exceptions)
		
		System.out.println("Program starts here ......");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();		// InputMismatchException is checked // compile-time excep
		
		System.out.println(50/num);			// divide by zero will get unchecked exception
		System.out.println("Program is completed");
		
		int arr[] = new int[5];
		System.out.println("Enter the index");
		int index = sc.nextInt();
		System.out.println("Enter the value");
		int value = sc.nextInt();
		
		arr[index] = value;			// ArrayIndexOutOfBoundsException
		System.out.println(arr[index]);

	}

}
