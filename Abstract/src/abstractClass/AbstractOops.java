package abstractClass;

abstract class Animal {
	public abstract void animalsound();
	public void sleep(){
		System.out.println("The animal is sleeping");
}
	
class cat extends Animal{
	public void animalsound() {
		System.out.println("Cat says meau meau");
	}
}

class dog extends Animal{
	public void animalsound(){
		System.out.println("the dog says bho bho");
	}
}


public class AbstractOops {

	public void main(String[] args) {
		cat x = new cat();
		x.animalsound();
		x.sleep();

		}

	}
}
