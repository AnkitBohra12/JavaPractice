/* Arrays are non-premitive data types which contians multiple elements
	with same data types
	
	Two types of arrays 
	1) single dimonsaional array
	2) multi dimonsional array
*/

package ArrayProgrammes;

public class SingleDimensionArray {
	
	public static void main(String [] args) {
		
		// Declartion of an array
		// First way
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
		
		// second way to declare any array
		
		int ar[]= {20,21,22,23,24,25,26};
		
		// access single elements by index
		System.out.println(arr[3]);
		System.out.println(ar[2]);
		
		// access all elements 
		for (int i=0; i<=ar.length-1; i++){
			System.out.print(ar[i] + "   ");
		}
		
		System.out.println();
		
		// for each/ exclusive for 
		for (int x : arr) {
			System.out.print(x + "    ");
		}
		
		System.out.println();
		
		// priting array in reverse order
		for (int i=ar.length-1 ; i>=0 ; i--){
			System.out.print(ar[i] + "   ");
		}
		
		// we cannnot reverse the array with exclusive for loop
		// only used for printing array in an order
		
		System.out.println();
		// Object Array
		
		Object arr2[]= {12,13,"Selenium",15,true,17,'S'};	
		System.out.println(arr2[2]);
		
		for (Object y : arr2) {
			System.out.print(y + "   ");
		}
	}	
}
