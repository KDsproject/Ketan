package sample;

public class Nonstaticblock {
		
	Nonstaticblock(){
		
		System.out.println("i am Nonstaticconstructor");
	}

		{
			System.out.println("running non-static-block1 of class Blocks3..");
		}
		public static void main(String[] args) {
			
			Nonstaticblock b1 = new Nonstaticblock();



	}

}
