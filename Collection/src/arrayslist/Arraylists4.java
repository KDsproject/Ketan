package arrayslist;
import java.util.*;

public class Arraylists4 {

	public static void main(String[] args) {
		
		ArrayList k1 = new ArrayList();
		k1.add("BMW");
		k1.add("Benz");
		k1.add("Audi");
		k1.add("Porche");
//		System.out.println(k1);
		
		Iterator itr = k1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List l1 = new ArrayList();
		
		l1.add("Pune");
		l1.add("Pune");
		l1.add(123);
		l1.add(null);
		System.out.println(l1);
		
		System.out.println(itr.hasNext());
		System.out.println();
	
	
	}

}
