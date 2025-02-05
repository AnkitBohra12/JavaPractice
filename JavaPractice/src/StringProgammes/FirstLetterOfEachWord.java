package StringProgammes;

public class FirstLetterOfEachWord {

	public static void main(String[] args) {
		
		String  st = "This is the main class";
		
		StringBuilder sb = new StringBuilder();
		
		String s[] = st.split("\\s");
		
		for(String i : s) {
			
			sb.append(i.charAt(0));
		}	
		
		System.out.println(sb.toString());	

	}

}
