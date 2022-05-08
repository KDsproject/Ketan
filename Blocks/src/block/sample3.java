package block;

public class sample3 {

		
		{
			System.out.println("running non-static-block1 of class Blocks3..");
		}
		public static void main(String[] args) {
			System.out.println("main() Starts");
			sample3 b1 = new sample3();
			System.out.println("---------------------------------");
			sample3 b2 = new sample3();
			System.out.println("main() ends");
			sample3 b3 = new sample3();
		}
	}
