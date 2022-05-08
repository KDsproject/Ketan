package inhertnace;

class sedan{
	void verna() {
		System.out.println("The verna is sedan car");
	}
}

class SUV extends sedan{
	void compass() {
		System.out.println("Compass is SUV car");
	}
}
class Hatchback extends SUV{
	void Jazz() {
		System.out.println("Jazz is hatchback car");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		System.out.println("***********Inheritance by Hatchback(CHILD of all class)********");
		Hatchback h1=new Hatchback();
		h1.verna();
		h1.compass();
		h1.Jazz();
		
		System.out.println("***************Inheritance by SUV (CHILD of sedan)******");
		SUV s1=new SUV();
		s1.compass();
		s1.verna();
		
		System.out.println("***************Inheritance by sedan(Parent)*****");
		sedan sd1=new sedan();
		sd1.verna();
		
		
	}

}
