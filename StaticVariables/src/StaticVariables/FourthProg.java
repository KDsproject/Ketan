package StaticVariables;

public class FourthProg {
	
	int num = 200;
	double num1=1000;

	public static void main(String[] args) {
		
		FourthProg sc = new FourthProg();
		System.out.println(sc.num); 
		
		sc.num=150;
		System.out.println(sc.num);
		System.out.println(sc.num=250);		
		sc.num=100;
		System.out.println(sc.num);		
		sc.num=50;
		System.out.println(sc.num);
		
		System.out.println(sc.num1);
		System.out.println(sc.num1=2000);
		sc.num1=800;
		System.out.println(sc.num1);
	}

}
