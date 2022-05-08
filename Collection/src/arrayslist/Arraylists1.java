package arrayslist;

import java.util.*;
import java.util.Collections;

public class Arraylists1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Pineapple");
		list1.add("Custardapple");

		System.out.println(list1);
		
//		Collections.sort(list1);
//		System.out.println(list1);

		list1.forEach(a -> {
			System.out.println(a);
		});
	
	}

}
