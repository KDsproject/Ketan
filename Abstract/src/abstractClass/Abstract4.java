package abstractClass;

abstract class Demo{
	abstract void print();
	void display() {
		System.out.println("i am non abstract display method");
	}
}
abstract class Demo1{
	void display() {
		System.out.println("i am non abstract method of demp1 class");
	}
	void display2() {
		System.out.println("i am non abstract method display2");
	}
}

abstract class demo2{
	abstract void print1();
	abstract void print2();
	abstract void print3();
	
}

class Ketan extends Demo{
	public void print() {
		System.out.println("Hello");
	}
}
public class Abstract4 {

	public static void main(String[] args) {
		Ketan k1 = new Ketan();
		k1.print();
		k1.display();
		
	}

}
