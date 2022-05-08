package bloc;

public class Sample4 {
		
	
	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class Blocks5..");
	}
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-1 of class Blocks5..");
	}
	{
		System.out.println("non static block 2");
	}
	{
		System.out.println("Non static block 3");
	}
	{
		System.out.println("non static block 4");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Sample4 b1 = new Sample4();
		System.out.println("---------------------------------");
		Sample4 b2 = new Sample4();
		System.out.println("main() ends");
	}
}
