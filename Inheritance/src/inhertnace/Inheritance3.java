package inhertnace;
//hierarchical inheritance
class Vehicle{
	void wheels() {
		System.out.println("I am run on wheels");
	}
}
class bike extends Vehicle{
	void bike() {
		System.out.println("i am run on 2 wheels");
	}
}

class car extends Vehicle{
	void car() {
		System.out.println("I am run on 4 wheels");
	}
}

class bus extends Vehicle{
	void bus() {
		System.out.println("i am run on more than 2 wheels");
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		
		bike b1 = new bike();
		b1.wheels();
		b1.bike();
		
		car b2 = new car();
		b2.car();
		b2.wheels();
	}
}
