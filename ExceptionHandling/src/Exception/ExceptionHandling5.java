package Exception;

import java.util.*;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		
		System.out.println("program starts from here...");
		
		// 1. abnormal statements
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int[] empIds = new int[5];
		try {
			System.out.println(empIds[3]);// ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled.." + e);
		}
		System.out.println("Programs ends here...");

	}

}
