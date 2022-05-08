package overriding;

class Human{
	public void eat() {
		System.out.println("Human is eating food");
	}
}
class Boy extends Human{
	public void eat() {
		super.eat();
		System.out.println("Boy eat Junk food");
	}
}
public class Overriding3 {

	public static void main(String[] args) {
			Boy b1 = new Boy();
			b1.eat();
	}

}
