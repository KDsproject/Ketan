package bloc;

public class Constructor01 {
	
	Constructor01() 
	{
		
		System.out.println("Hi Everyone");
	}
	
	Constructor01(int age)
	{
		
		System.out.println("Good Morning");
		
	}
	
	Constructor01 (int num, int num2)
	{
		
		System.out.println("Today is Thursday");
	}
	

	public static void main(String[] args) {

		Constructor01 sc = new Constructor01();
		Constructor01 age = new Constructor01(20);
		Constructor01 num = new Constructor01(40,50);
	}

}
