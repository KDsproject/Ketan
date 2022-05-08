package oopss;

public class Objectclasswithorverride {
		
	static int last_roll = 100;
	int roll_no;
	
	//constructor
	Objectclasswithorverride()
	{
		roll_no = last_roll;
		last_roll++;
	}
	
	@Override
	public int hashCode()
	{
	
		return roll_no;
	}
	//drivercode
	
	public static void main(String[] args) {
		
			Objectclasswithorverride ref = new Objectclasswithorverride();
			System.out.println(ref.roll_no);
			System.out.println(ref);
			System.out.println(ref.toString());
			System.out.println(ref.hashCode());
	}

}
