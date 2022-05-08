package overriding;

class Avengers {
	public void Tony() {
		System.out.println("Tony Stark is Iron Man");
	}
}

class Marvels extends Avengers{
	public void Spiderman() {
		super.Tony();
		System.out.println("Peter Parker is Spiderman ");
	}
}
public class Overriding4 {

	public static void main(String[] args) {
		Marvels A1 = new Marvels();
		A1.Spiderman();

	}

}
