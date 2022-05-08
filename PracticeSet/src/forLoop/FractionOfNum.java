package forLoop;

public class FractionOfNum {

	public static void main(String[] args) {

		 int number = 5;
		 System.out.print("The factors of "+number+" are: ");
		 int i =1;
		    for(i=1; i<=number; i++) {
		    	if(number%i==0) {
		    		System.out.print(" "+i);
		    	}
		    }
		  }
		}
		
