package sample;

public class Staticblock {
	
		
		static {
			System.out.println("******** Running static-block1 of class Blocks1..");
		}
		Staticblock(){
			System.out.println("i am Constructor");
		}
		public static void main(String[] args) {
			Staticblock b1 = new Staticblock();

			System.out.println("I am main() static Block..");
		
		}
	

	}


