package day1;

public class Constructor02 {
	
	int age=30;
	double salary=2000;
	/**
	 *  below is default constructor, that will be written by java compiler at compile time
	  Cons2(){
			//empty body
		}
	*/

	public static void main(String[] args) {

		Constructor02 c1 = new Constructor02();
		System.out.println(c1.age);// 0
		System.out.println(c1.salary);// 0.0
		
	}

}
