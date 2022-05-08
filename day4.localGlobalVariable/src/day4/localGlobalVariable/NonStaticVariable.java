package day4.localGlobalVariable;

public class NonStaticVariable {
	
	int age = 30;
	int age2 = 50;
	
	Static int num = 05;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticVariable ref = new NonStaticVariable();
		System.out.println("NonStaticVariable:" +ref.age);
		
		ref.age= 35;
		System.out.println("2nd variable:" +ref.age);
		
		NonStaticVariable ref2 = new NonStaticVariable();
		System.out.println(ref2.age);
		
		NonStaticVariable kd = new NonStaticVariable();
		System.out.println(kd.age2);
		
		NonStaticVariable abcd = new NonStaticVariable();
		System.out.println(abcd.age);
		}

}
