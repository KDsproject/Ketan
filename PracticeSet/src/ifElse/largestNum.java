package ifElse;

public class largestNum {

	public static void main(String[] args) {
		int a = 45;
		int b = 90;
		int c = 80;
		
		if(a>b && a>c) {
			System.out.println("A is greater");
		}else if(b>a && b>c) {
			System.out.println("B is greater");
			
		}else {
			System.out.println("C is greater");
		}
			
	}

}
