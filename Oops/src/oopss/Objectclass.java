package oopss;

class Demo{
	static int age = 30;
	void display() {
		System.out.println("I am display()..");
	}
}

public class Objectclass extends Demo {
	
	static int last_roll = 100;
	int roll_no;

	// Constructor
	Objectclass()
    {
        roll_no = last_roll;
        last_roll++;
    }

	public static void main(String[] args) {
		
		System.out.println(age);
		
		Objectclass ref = new Objectclass();
		System.out.println("roll no. "+ref.roll_no);
		System.out.println("Last roll no. "+last_roll);
		Demo d1 = new Demo();
		d1.display();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
	}

}
