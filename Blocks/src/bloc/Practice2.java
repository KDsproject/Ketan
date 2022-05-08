package bloc;

public class Practice2{
	
	static int num = 50; 											//Global static variable      
	double expense = 5000;											//Global Non-Static variable
	
	static {														//static block
		System.out.println("This should be print first");
	}
	
	{																//Non static block
		System.out.println("this should be print when object is created in main method");
	}
	
	public static void Ketan() {									//static method
			int num1=80;
			System.out.println(num1);
	}
	
	 void vijay() {													//Non static method
		int alpha=10;
		System.out.println(alpha);
	}
	 
	 public static void method(int age, int salary, int mob ) {		//method Overloading
		 int res = age+salary+mob;
		 System.out.println(res);
	 }
	 
	 public static void Method2(int age, int salary) {				//method overloading
		 int res = age*salary;
		 System.out.println(res);
	 }


	public static void main(String[] args) {
		Practice2 sc = new Practice2();
		Practice2.Ketan();
		sc.vijay();
		Practice1.method(25,30000,789);
		Practice1.Method2(25,30000);
		System.out.println(num);
		System.out.println(sc.expense);
		
		
	}
	
class Demo{
	
	
	public void Slash() {
		int date = 23;
		System.out.println(date);
		
	}
		
	}
}
	