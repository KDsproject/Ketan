package abstractClass;

abstract class Animal2{
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("the animal Sleep :ZzzzzZZZ");
	}
}

class Pig3 extends Animal2{
	public void animalSound() {
		System.out.println("the pig says: Wee Wee");
	}
}

class dog3 extends Animal2{
	public void animalSound() {
		System.out.println("The dog says: bhow bhow");
	}
}
public class Abstract3 {

	public static void main(String[] args) {
		dog3 d1 = new dog3();
		d1.animalSound();
		d1.sleep();
		
		Pig3 p3 = new Pig3();
		p3.animalSound();
		
	}

}
