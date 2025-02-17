//Hashset


// 1) Not takes the duplicate values
// 2) No hard rule that it will show elements in order
// 3) No indexing so we have to specify the element name

package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
//		Declaration
		
		HashSet set = new HashSet();
//		Set myset = new HashSet();
//		HashSet<String> set2 = new HashSet<String>();
		
		set.add(500);
		set.add("hello");
		set.add(500);
		set.add('O');
		set.add(78.95);
		set.add(true);
		set.add(null);
		set.add(null);
		
//		Size = tell the size of the set
		System.out.println(set.size());
		
		System.out.println(set);
		
//		No indexing so we have to specify the element name
		set.remove(78.5);
		System.out.println(set);
		
//		insertion, access particular element not possible cuz indexing is not there
		
//		converting set into arrayList
		ArrayList list = new ArrayList(set);
		System.out.println(list);
		System.out.println(list.get(2));
		
		for(Object x:set) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		
		System.out.println();
		
		set.clear();
		System.out.println(set.isEmpty());
		

	}
	
//	Take a string and take our duplicate elements from string

}
