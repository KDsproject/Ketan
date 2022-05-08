package day1;

public class ThisKeyword02 {

	
		int rollno;
		float fee;
		
		ThisKeyword02(int rollno)
		{
			this.rollno = rollno;
		}
		
		ThisKeyword02(int rollno, float fee)
		{	
			this(rollno);
			
			this.fee = fee;
			
			System.out.println(fee);
		}
		
		void display() {
			System.out.println(rollno+"roll no & fees"+fee);
		}
		
		
		public static void main(String[] args) {
			ThisKeyword02 sc = new ThisKeyword02(25);
			System.out.println("the roll no of student is: "+sc.rollno);
			ThisKeyword02 sc1 = new ThisKeyword02(43, 55f);
			System.out.println("the fee of student :"+sc1.fee);
			
			sc.display();
			sc1.display();
			
			
	}

}
