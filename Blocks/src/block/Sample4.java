package block;

public class Sample4 {
	
	static {
		System.out.println("Hi i am static block");
	}
	{
		System.out.println("Hi i am non-static block");
	}

	public static void main(String[] args) {
		Sample4 s2 = new Sample4();
		

	}

}
