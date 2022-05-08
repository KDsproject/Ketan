package arrayslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Arraylists5 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(23);
		l1.add(20);
		l1.add(3);
		l1.add(48);
		l1.add(87);
		
		System.out.println(l1.size());
		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.reverse(l1);
		System.out.println(l1);
		

	}

}
