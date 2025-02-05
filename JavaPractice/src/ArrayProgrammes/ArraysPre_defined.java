package ArrayProgrammes;

import java.util.Arrays;

public class ArraysPre_defined {

	public static void main(String[] args) {
		
		// Sort an array
		
		int arr[] = {10,9,15,27,4,11};
		Arrays.sort(arr);
		
		for(int i:arr) {
			System.out.print(i + "  ");
		} 
		System.out.println();
		
		// fill method
		
		int ar[] = new int [5];
		Arrays.fill(ar, 3);
		
		for(int i : ar) {
			System.out.print(i + "  " );
		}	
		System.out.println();
		
		
		// toString method
		
		String arr_str = Arrays.toString(arr);
		System.out.println(arr_str);
		
		// copyOf
		
		int copy_arr[] = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(copy_arr));
		
		// equals
		System.out.println(Arrays.equals(arr, copy_arr));
	}
}
