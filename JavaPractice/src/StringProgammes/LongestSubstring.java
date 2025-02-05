package StringProgammes;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		
		 lengthOfLongestSubString("bohra");
	}

	public static void lengthOfLongestSubString(String s) {
		String longestSubString = null;
		int longestSubStringLength = 0;
		
//		used LinkedHashMap which will maintain the insertion order of the entries
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		char[] arr = s.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			char ch =arr[i];
			
			if(!map.containsKey(ch)) {
				map.put(ch, i);	// a - 0, b - 1, b - 2
			} 
			else {
				i = map.get(ch);
				map.clear();
			}
			
			if(map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
			}
			
		}		
		System.out.println(longestSubString);
		System.out.println(longestSubStringLength);
	}

}
