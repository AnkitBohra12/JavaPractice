package NormalProgrammes;

public class SquareOfANumber {
	
	public static int square(int a) {	
		return a*a;
	}
	
// *********************** Area of rectangle using parameter *******************************

		public static int rectangle(int l,int b ) {
			return l*b;
		}	

	public static void main(String[] args) {
		System.out.println("Starting..................");
		System.out.println(square(2));
		System.out.println("Area of rectangle using parameter : "+ rectangle(2,3));
		System.out.println("Ending.............");
	}

}


