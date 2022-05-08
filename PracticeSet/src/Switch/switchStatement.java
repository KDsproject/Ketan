package Switch;

public class switchStatement {

	public static void main(String[] args) {

		int num1= 10;
		int num2=20;
		
		switch(8) {
			
		case 1: System.out.println(num1+num2);
		break;
		case 2: System.out.println(num1*num2);
		break;
		case 3: System.out.println(num1-num2);
		break;
		case 4: System.out.println(num1/num2);
		break;
		default: System.out.println("unknown opeartion");
		}

	}

}
