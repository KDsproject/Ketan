package bloc;

public class Sample8 {


		int age = 25;
		double salary = 25000;

		void print() {
			System.out.println("The age is :"+age);
			System.out.println("salary is :"+salary);
		}

		public static void main(String[] args) {
			Sample8 sc = new Sample8();
			sc.print();
			
			System.out.println("age print with Object: "+sc.age);
			System.out.println("salary print with Object: "+sc.salary);
		
		}


}
