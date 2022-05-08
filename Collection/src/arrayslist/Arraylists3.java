package arrayslist;
import java.util.*;

public class Arraylists3 {

	public static void main(String[] args) {
		
		ArrayList str = new ArrayList();
		
		str.add("Mango");
		str.add("Apple");
		str.add("Chiku");
		str.add("Strawberry");
		System.out.println(str);
		
		ArrayList str1 = new ArrayList();
		str1.add("MangoShake");
		str1.add("AppleShake");
		str1.add("ChikuShake");
		str1.add("StrawberryShake");
		System.out.println(str1);
		
//		str1.clone();
//		System.out.println(str1);
//		
//		str.retainAll(str1);
//		System.out.println(str);	
		
		Collections.reverse(str);
		System.out.println(str);

	}

}
