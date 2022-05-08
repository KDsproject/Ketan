package arraylist;

import java.util.ArrayList;
import java.util.*;

public class Collectionarraylist {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		list.add("Lamborghini");
//		list.add("Ferrari");
//		list.add("rollsroyce");
		list.add(9);
		list.add(8);
		list.add(5);
//		list.add('P');
//		list.add(123);
//		list.add(true);
//		list.add(null);        
//		list.add(new Collectionarraylist());
		System.out.println(list.size());
		System.out.println(list);
		
//		for(int i=0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		for(Object Ketan:list) {
//			System.out.println(Ketan);
//		}
		
//		list.set(1, "Porche");
//		System.out.println(list);
		
		Collections.sort(list);         //by sorting the only similar element will arrange in ascending order
		
	}

}
