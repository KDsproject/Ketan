package sample;

public class FinalVariable {
     
	public static void main(String[] args) {

		final int empId=123;
		System.out.println(empId);//123
//		int empId=456;//error at compile time as final variable value can't be changed
		System.out.println(empId);//456
//		empId=789;//error at compile time as final variable value can't be changed
		System.out.println(empId);//789
//		empId=654;//error at compile time as final variable value can't be changed
		System.out.println(empId);//654
	}

	}


