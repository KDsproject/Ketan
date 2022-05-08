package arrayslist;

import java.util.*;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.ArrayList;

public class Listarray {

	public static void main (String[] args) {
		ArrayList list = new ArrayList();// Creating arraylist
		list.add("Mango");// auto-upcasting from String to Object class object
		list.add(1235);// first boxing to Integer class object---> upcasting to object class
		list.add("Banana");
		list.add('C');// first boxing to Character class object---> upcasting to object class
		list.add(15.26);// first boxing to Double class object---> upcasting to object class
		list.add(true);// first boxing to Boolean class object---> upcasting to object class
		list.add(new Listarray());// ArrayListExample1 class object will be upcasted to Object class object
		// Printing the arraylist object
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversing list through for-each loop:");
		// Traversing list through for-each loop
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		// accessing the element
		System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing/update existing object
		list.set(1, "Dates");
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
	}
}