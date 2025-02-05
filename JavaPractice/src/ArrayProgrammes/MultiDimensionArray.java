package ArrayProgrammes;

public class MultiDimensionArray {

	public static void main(String[] args) {
		
		//	Declaration of Multidimensional Array
		
		int arr[][] = new int[3][4];
		
		arr[0][0]=10;
		arr[0][1]=11;
		arr[0][2]=12;
		arr[0][3]=13;
			
		arr[1][0]=10;
		arr[1][1]=11;
		arr[1][2]=12;
		arr[1][3]=13;
		
		arr[2][0]=10;
		arr[2][1]=11;
		arr[2][2]=12;
		arr[2][3]=13;
		
		
		// Second way to declare
		
		int brr[][] = {{40,41,42,43,44,45,46},
						{0,1,2,3,4,5,6},
							{4,4,4,4,4,4,4},
								{400,411,422,433,444,455,466}};
		
		
		// Take out single element from the array	
		System.out.println(brr[2][1]);
		System.out.println(brr[2][5]);
		
		// how to find length of the rows and column
		System.out.println("rows : " + brr.length);
		System.out.println("cols : " + brr[3].length);
		
		// print all elements together 
		
		for(int r=0 ; r <= brr.length-1 ; r++) {
			for (int c=0 ; c <= brr[r].length-1 ; c++) {
				System.out.print(brr[r][c] + "  ");
			}	
			System.out.println();
		}
		System.out.println();
		// exclusive for loop
		
		for(int []xrr : arr) {
			for(int y:xrr) {
				System.out.print(y + " ");
			}
			System.out.println();
		}	
	}
}
