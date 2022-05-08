package arrayslist;
import java.util.*;
public class Arraylists2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println(al);
		al.add(1, "Nilesh");
		System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		al1.add("Vishal");
		al1.add("Pavan");
		
		al.addAll(al1);
		System.out.println(al);
		
		al.removeAll(al1);
		System.out.println(al);
		
		al.removeIf(str-> str.contains("Vijay"));
		System.out.println(al);
		
		al.clear();
		System.out.println(al);

	}

}
