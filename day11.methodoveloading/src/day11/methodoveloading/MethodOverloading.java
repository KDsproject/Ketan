package day11.methodoveloading;

public class MethodOverloading {

	
	public static void main(String[] args) {

//		System.out.println("Hi, Good morning Everyone");
//		System.out.println("Staying in Pune");
//		System.out.println("I am 30 yrs old");
//		System.out.println("I am getting 96000");
//		
//		System.out.println("Hi, Good morning Everyone");
//		System.out.println("Staying in Pune");
//		System.out.println("I am 25 yrs old");
//		System.out.println("I am getting 56000");
//		
//		System.out.println("Hi, Good morning Everyone");
//		System.out.println("Staying in Pune");
//		System.out.println("I am 26 yrs old");
//		System.out.println("I am getting 45000");
		
		printDetails(30, 96000);
		printDetails(25, 56000);
		printDetails(26, 45000);
	}
	/**
	 * access modifier: public
	 * non-access modifiers: static
	 * returntype: void
	 * methodname: printDetails
	 * @param age
	 * @param salary
	 */
	public static void printDetails(int age, int salary) {
		System.out.println("Hi, Good morning Everyone");
		System.out.println("Staying in Pune");
		System.out.println("I am "+age+" yrs old");
		System.out.println("I am getting "+salary);
		//return;//optional because if you don't write it dn java compiler will write it
	}
}
