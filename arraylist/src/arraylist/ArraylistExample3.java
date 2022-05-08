package arraylist;

import java.util.*;

public class ArraylistExample3 {

	public static void main(String[] args) {
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(12);
		l2.add(10);
		l2.add(2);
		l2.add(40);
		l2.add(235);
		
		System.out.println(l2.size());
		System.out.println(l2);
		
		Collections.sort(l2);
		System.out.println(l2);
		
		Collections.reverse(l2);
		System.out.println(l2);
	}

}
