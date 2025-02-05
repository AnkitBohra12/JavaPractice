package StringProgammes;

// WJP to remove duplicates from given string 			
// str1 = "automation" , o/p : "automin"

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		
		String st = "automation";
		String res = "";
		
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(res.indexOf(ch) == -1) {
				res = res+ch;
				
			}
		}
		System.out.println(res);
	}
}
