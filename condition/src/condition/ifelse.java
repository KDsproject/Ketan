package condition;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		
		if(age>18) {
			System.out.println("Adult");
		}else {
			System.out.println("Non adult");
		}
	}

}
