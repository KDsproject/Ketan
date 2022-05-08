package day1;

public class Constructor01 {


		Constructor01() {
			System.out.println("This is a zero-para constructor");
		}
		Constructor01(char c) {
			System.out.println("This is a single-para constructor");
		}
		Constructor01(int num1, int num2) {
			System.out.println("This is a int-int parameterized constructor");
		}	
		Constructor01(double num1, int num2) {
			System.out.println("This is a double-int parameterized constructor");
		}
		Constructor01(int num1, double num2) {
			System.out.println("This is a int-double parameterized constructor");
		}
		Constructor01(double num1, boolean num2,char c) {
			System.out.println("This is a double-int parameterized constructor");
		}
		public static void main(String[] args) {
			Constructor01 c1 = new Constructor01();
			Constructor01 c2 = new Constructor01(10, 20);
			Constructor01 c3 = new Constructor01('d');
			Constructor01 c4 = new Constructor01(10d, 20);
			Constructor01 c5 = new Constructor01(10, 20.45);

	}

}
