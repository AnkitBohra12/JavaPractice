/*Collectoin : It is used to represent group of elements/ objects/ data into single entity. It is inteface in java.

Collection(I)-------
			-----> List(I) ----> ArrayList(C)
			-----> Set(I) ----> HashSet(C)
		
ArrayList ---> It is a class used in implement List Interface
1) Heterogeneous data is allowed.
2) Insertion order is preserved(indexing concept)
3) Duplicate elements allowed
4) Multiple nulls allowed
*/

package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_ArrayListDemo {

	public static void main(String[] args) {
		
//		Declaration
		
		ArrayList myList = new ArrayList();
//		List list = new ArrayList();		// with interface
//		ArrayList<String> list2 = new ArrayList<String>();
		
		myList.add(564);
		myList.add(657.897);
		myList.add("Selenium");
		myList.add("Selenium");
		myList.add('X');
		myList.add(true);
		myList.add(null);
		myList.add(null);
		
		System.out.println(myList);
		
		System.out.println("Length of arrayList : " + myList.size());
		
//		Remove element form ArrayList with the help of indexing	
		myList.remove(6);
		System.out.println("After removing an element :" + myList);
		
//		Insert element in ArrayList	
		myList.add(3,"cypress");
		System.out.println("Print after insertion of element : " + myList);
		
//		Modify and element or update any element
		myList.set(3, "Welcome");
		System.out.println("After modifying the element : " + myList);
		
//		Access element in ArrayList
		System.out.println(myList.get(5));
		
//		Reading all elements of ArrayList
		for(int i=0; i<=myList.size()-1 ; i++) {
			System.out.print(myList.get(i) + "  ");
		}
	
		System.out.println();
		for (Object x: myList){
			System.out.print(x + "  ");
		}
		
		System.out.println();
		
		Iterator it = myList.iterator();	// check for the element in the ArrayList
		
		while(it.hasNext()) {		// returns the boolean value 
			System.out.print(it.next() + "  ");
		}

	}

}
