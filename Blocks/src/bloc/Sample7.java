package bloc;

public class Sample7 {
	
	static int age;
	double salary;
	/* static block or SIB */
	static {
		System.out.println("Let see which print first");
		age = 30;
	}
	/* non-static block or IIB */
	{
		salary = 45000.32;
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: " + Sample7.age);
		System.out.println("---------------------------------");
		Sample7 b1 = new Sample7();
		System.out.println("salary: " + b1.salary);
		System.out.println("main() ends..");
	}
}


