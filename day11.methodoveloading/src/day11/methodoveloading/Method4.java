package day11.methodoveloading;

public class Method4 {

	public static void main(String[] args) {

		System.out.println(Method4.getAdditionResult(25.5, 30.2));
		Method4.getAdditionResult2(20.0, 40.0);
	}
	static double getAdditionResult(double num1,double num2) {
		double res = num1+num2;
		return res;
		
	}
	
	static void getAdditionResult2(double num1,double num2) {
		double res = num1+num2;
		System.out.println("Addition result: "+res);

	}

}
