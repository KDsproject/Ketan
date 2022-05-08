package wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		
		int age =30;
		System.out.println(age);          //explicit boxing operation
		Integer b1 = new Integer(age);
		System.out.println(b1);
		System.out.println(age==b1);
		
		Integer b2 = new Integer(50);     //explicit boxing operation
		System.out.println(b2);
		
		Integer b3 = 40;                 //implicit boxing operation
		System.out.println(b3);
		
	}

}
