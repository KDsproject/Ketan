package day4.localGlobalVariable;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class NonStaticVariable1 {
	//Global Variable
	int mobileNum=123;//non-static Global Variable
	public static void main(String[] args) {
		System.out.println("Program Starts...");
		//Creating instance/object of a class
		
		//NonStaticVariable1 ref;//no object created at this line, its just a like a variable name
		//ref= new NonStaticVariable1();//object created
				//or
		NonStaticVariable1 ref = new NonStaticVariable1();
		System.out.println("1st ref, NonStatic Global variable: "+ref.mobileNum);//123
		ref.mobileNum=456;
		System.out.println("1st ref, Updated NonStatic Global variable: "+ref.mobileNum);//456
		//2nd instance/object creation
		NonStaticVariable1 ref1 = new NonStaticVariable1();
		System.out.println("2nd ref, NonStatic Global variable: "+ref1.mobileNum);//123
		System.out.println("Program Ends...");
	}
}