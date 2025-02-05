package NormalProgrammes;

public class LargestofThreeNumbers {

	public static void main(String[] args) {
		 
		int a = 2, b = 1, c = 5;
		
		if(a<b) {
			System.out.println("b is greater");
		}
		else if(b<c) {
			System.out.println("c is greater");
		}
		else {
			System.out.println("a is greater");
		}
		
		int result = (a<b)?a:b ? (b<c)?b:c;

	}

}
