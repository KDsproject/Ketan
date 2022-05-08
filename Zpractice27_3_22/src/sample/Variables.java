package sample;

public class Variables {
	 int game=900;
	 double age = 50;
	Variables(int age){
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		
		int age = 25;
	
		Variables v1 = new Variables(30);
		System.out.println(v1.game);
		System.out.println(v1.age);
		System.out.println(age);
	}

}
