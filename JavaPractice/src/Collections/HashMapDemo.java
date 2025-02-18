//  Map(I)-----> HashMap(C)
//  IT is a class which implements Map interface
//	Data can be stored in form of key/value pairs
//	Key is unique, but values can be duplicate
//	Insertion order not preserved (Index not followed)


package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
//		Declaration of HashMap
//		HashMap map = new HashMap();		
//		Map mymap = new HashMap();
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(100,"Mathews");
		map2.put(102,"Luke");
		map2.put(104,"Scott");
		map2.put(102,"William");
		map2.put(109,"Mathews");
		
		System.out.println(map2);
		
//		Size of HashMap
		System.out.println("Size of map is = " + map2.size());

//		Remove pair (element) from the HashMap
		map2.remove(109);		// mention key you want to remove
		System.out.println(map2);
		
//		Access the value though the key
		System.out.println(map2.get(102));
		
//		take all the keys
		System.out.println(map2.keySet());
		
//		take all the values 
		System.out.println(map2.values());
		
//		entry set means the ways the form of keys are starting
		System.out.println(map2.entrySet());
		
//		fetch the values of KeySet
		for(int k: map2.keySet()) {
			System.out.println(k + "\t" + map2.get(k));
		}
	
//		Through Iterator
		Iterator<Entry<Integer,String>> itr = map2.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer,String> entry = itr.next();
			System.out.println(entry.getKey()+ "\t" + entry.getValue());
			
//			find empty
			System.out.println(map2.isEmpty());
			map2.clear();
//			System.out.println(map2.isEmpty());
		}
	}

}
