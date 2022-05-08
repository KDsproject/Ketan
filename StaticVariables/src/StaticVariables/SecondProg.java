package StaticVariables;

public class SecondProg {

	static double iron = 550;	
	
	public static void main(String[] args) {
		
		System.out.println(iron);
		
		iron = 400;
		
		System.out.println(SecondProg.iron);

	}

}
