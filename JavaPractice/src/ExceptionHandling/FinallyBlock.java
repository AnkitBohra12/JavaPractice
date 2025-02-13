package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String str = null;
		
		try {
			System.out.println(str.length()); 
			}
		catch(Exception obj){
			System.out.println(obj.getMessage());
		}
		finally {
			System.out.println("Finally block alawys executed");
		}

	}

}
