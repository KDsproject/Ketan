package day1;

public class Constructor03 {

	

		int roll=39;
		double salary=99000;
		
		void display() {
			System.out.println("The roll no. is: "+roll+"  The salary is: "+salary);
		}
		
		public static void main(String[] args) {
			Constructor03 sc = new Constructor03(); 
			sc.display();
	}

}
