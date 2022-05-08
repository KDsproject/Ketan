package day1;

public class ThisKeyword {

	
	ThisKeyword()
	{	
		
		System.out.println("*******first*******");
	}
	
	ThisKeyword(char a)
	{	
		
		System.out.println("******Second******");
	}
	
	ThisKeyword(int age, float num)
	{ 	
		
		System.out.println("******Third******");
	}
	public static void main(String[] args) {
		ThisKeyword sc = new ThisKeyword();
		ThisKeyword sc1 = new ThisKeyword('d');
		ThisKeyword sc2 = new ThisKeyword(22, 23.5f);
		
		
		
	}

}
