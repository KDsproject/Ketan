package wrapper;

public class Wrapper2 {

	public static void main(String[] args) {

		char c1 = 'A';
		
		Character object = new Character(c1); //explicit boxing
		System.out.println(c1==object);
		
		Character object2 = new Character('Z');   //explicit boxing
		System.out.println(object2);
		
		boolean b = true;                        //implicit boxing
		Boolean b1 = new Boolean(b);				//explicit boxing
		
		System.out.println(b==b1);
		
		
		
	}

}
