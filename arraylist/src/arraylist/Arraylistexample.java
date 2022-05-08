package arraylist;

import java.util.*;

public class Arraylistexample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
//		System.out.println(al);
		al.add("Nishant");
		al.add("Sanjay");
		al.add("Raju");
		al.add("Nilesh");
//		System.out.println(al);
//		al.add(1, "Ketan");
//		System.out.println(al);
//		
		ArrayList al2 = new ArrayList();
		al2.add("bike");
		al2.add("Sportbike");
		al2.add("Taxi");
		al2.add("Scooty");
//		System.out.println(al2);
//		
//		al.addAll(al2);
//		System.out.println(al);
//		al2.addAll(al);
//		System.out.println(al2);
//		
		ArrayList al3 = new ArrayList();
		al3.add("Plane");
		al3.add("Chopper");
		
		al2.addAll(1,al3);
		System.out.println(al2);
		
		al2.removeAll(al3);
		System.out.println(al2);
		
		al2.clear();
		System.out.println(al2);
		
	
				
	}

}
