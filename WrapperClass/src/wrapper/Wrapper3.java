package wrapper;

public class Wrapper3 {

	public static void main(String[] args) {

		Double double0 = 343.334;
		System.out.println(double0);
		
		double salary = double0.doubleValue();   //unboxing
		System.out.println(salary);
		System.out.println(salary==double0);
	}

}
