package StringProgammes;

// Remove all the white spaces in a string

public class RemoveAllSpaces {

	public static void main(String[] args) {
		
		String s = " to the same one that we are 		looking for";
		
		System.out.println(s.replaceAll("\\s", ""));
		
		System.out.println(s.replaceAll("\s", ""));		// can't remove the tab
		
	}

}
