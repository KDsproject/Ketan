package overriding;

class Animal{
	public void walks() {
		System.out.println("Animals can walk");
	}
}
class dog extends Animal{
	public void walk() {
		System.out.println("Dog can walk");
	}
	public void bark() {
		System.out.println("dog can bark");
	}
}
public class OverridingMethod {

	public static void main(String[] args) {
		dog d1 = new dog();
		d1.walk();
		d1.bark();
//		d1.walks();
		
		Animal a1= new dog();
		a1.walks();
	}
}
