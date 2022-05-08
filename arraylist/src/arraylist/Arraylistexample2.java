package arraylist;

import java.util.*;
//import java.util.ArrayList;
import java.util.Iterator;
public class Arraylistexample2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Hanumat");
		
//	System.out.println(al);
	
	ArrayList al2 = new ArrayList();
		al2.add("Ravi");
		al2.add("Kiran");
		al2.add("Vijay");
		al2.add("Sarvada");
//	System.out.println(al2);
	
//	al.retainAll(al2);
//	System.out.println(al);
	
	Iterator itr = al2.iterator();
//	System.out.println(itr);
	while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
