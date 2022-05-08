package StaticVariables;

public class Fifthprog {
	
	static float value=120;
	static float value1=120.5f;
	static double value2=189;
	int value3=456;
	boolean age;
	public static void main(String[] args) {
		
		System.out.println(value);
		System.out.println(value1);
		System.out.println(Fifthprog.value2);
		
		Fifthprog sc = new Fifthprog();
		System.out.println(sc.value3);
		
		Fifthprog sc1 = new Fifthprog();
		System.out.println(sc1.age);
		System.out.println(sc.age);     //you can use one object to other variable also in same method 
	}

}
