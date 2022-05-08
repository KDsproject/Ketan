package day11.methodoveloading;

public class MethodOverloadnig2 {

	public static void main(String[] args) {
		
		MethodOverloadnig2.Ketan(30,23);
		
	}

	public static void Ketan(int age, int day) {
		System.out.println("Hi my age is: "+age);
		System.out.println("Hi my day was:"+day);
	}
}
