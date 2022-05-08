package StaticVariables;

public class Eightprog {
	int mobnum=123;
	char grade='a';
	static char grade1;
	public static void main(String[] args) {
		Eightprog sc = new Eightprog();
		System.out.println(sc.mobnum);
		System.out.println(sc.grade);
		System.out.println(grade1);
		
		sc.mobnum=456;
		System.out.println(sc.mobnum);
		System.out.println(sc.mobnum=789);
	}

}
