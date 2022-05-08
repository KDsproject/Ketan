package arrayslist;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;

public class Arraylists {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Mango");
		list.add("12345");
		list.add("Banana");
		list.add(null);
		list.add('K');
		list.add(15.3);
		list.add("");
		list.add(true);
		System.out.println(list.size());
		System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
			
			for(Object Fruit:list) {
				System.out.println(Fruit);
				
		list.set(1,"Apple");
		System.out.println(list);
		
			}
		}
	}
}
