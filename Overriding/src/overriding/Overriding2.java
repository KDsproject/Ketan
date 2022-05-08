package overriding;

class Animal3{
	public void move() {
		System.out.println("Animals can move");
	}
}

class dog2 extends Animal3{
	public void move() {
		super.move();
		System.out.println("dogs can walk & run ");
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		Animal3 a1 = new dog2();
		a1.move();

		
	}

}
