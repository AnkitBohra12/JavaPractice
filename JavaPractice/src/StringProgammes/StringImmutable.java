package StringProgammes;

//WJP to prove that String objects are immutable
public class StringImmutable {

	public static void main(String[] args) {
		
		
		String s  = "To the ";
		
		String s1 = s.concat("man");
		
		System.out.println(s);
		System.out.println(s1);

	}

}
