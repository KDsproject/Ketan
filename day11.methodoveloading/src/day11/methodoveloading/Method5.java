package day11.methodoveloading;

public class Method5 {

	public static void main(String[] args) {
		System.out.println("first method :"+Method5.getInterest(2,3,40));
		System.out.println("Second Method :"+getInterest1(20,30,4));
		
		Method5.getInterest2(20, 40, 1);
		System.out.println(Method5.Ketan('C'));
		
		Method5 ref = new Method5();
	
		System.out.println(ref.Ketan2(40));
	}
	
	public static int getInterest(int p,int r,int t) {
		return (p*r*t)/100;
	}
			//or
	public static double getInterest1(int p,double r,int t) {
		double res=(p*r*t);
		return res;
	}
		//or
	public static void getInterest2(int p,double r,int t) {
		double res=(p*r+t);
		System.out.println("Interest is :"+res);

		
	}
	public static char Ketan(char a) {
		return (a);
		
	}
	public int Ketan2(int age) {
		return age;
	}
}

