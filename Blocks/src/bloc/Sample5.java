package bloc;

public class Sample5 {


		/* static block or SIB*/
		static {		
			System.out.println("running static-block-1 of class Blocks2..");		
		}
		/* non-static block or IIB*/
		{
			System.out.println("running non-static-block-1 of class Blocks4..");
		}
		public static void main(String[] args) {
			System.out.println("main() Starts");
			Sample5 b1=new Sample5();
			System.out.println("---------------------------------");
			Sample5 b2=new Sample5();
			System.out.println("main() ends");
		}
		/* static block or SIB*/
		static {		
			System.out.println("running static-block-2 of class Blocks2..");		
		}
		/* non-static block or IIB*/
		{
			System.out.println("running non-static-block-2 of class Blocks4..");
		}
	

	}


