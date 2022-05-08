package StaticVariables;

public class FirstProg {
	
	static int age = 30;

	public static void main(String[] args) {
		
		System.out.println(FirstProg.age);
		
		age = 40;
		
		System.out.println(FirstProg.age);
		
		int age = 80;
		
		System.out.println(FirstProg.age);

	}

}
