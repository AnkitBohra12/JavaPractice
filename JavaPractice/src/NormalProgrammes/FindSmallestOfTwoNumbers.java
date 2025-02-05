package NormalProgrammes;

public class FindSmallestOfTwoNumbers {

	public static void main(String[] args) {
		
		int a = 2, b = 4;
		
		int res = (a<b)? a:b;
		System.out.println(res);
		
		if(a<b) {
			System.out.println(a+" is smaller number");
		}else {
			System.out.println(b+" is the smallest");
		}

	}

}
