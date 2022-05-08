package inhertnace;
class Grandfather{
	Grandfather(){
		System.out.println("I am grandfather class constructor");
	}
	void myLand() {
		System.out.println("grandfather's land");
	}
}

class Father extends Grandfather {
	Father(double d){
		super();
		System.out.println("i am father class constructor");
	}
	void myHome() {
		System.out.println("fathers home");
	}
}

class child extends Father{
	child(int i){
		super(12.34);
		System.out.println("i am child class constructor");
	}
	void myBike() {
		System.out.println("childs BIKE");
	}
}
public class Inheritance5 {

	public static void main(String[] args) {
		child c1 = new child(90);
		c1.myBike();
		c1.myHome();
		c1.myLand();
		
		Father f1 = new Father(34.5);
		f1.myHome();
		f1.myLand();
		
		Grandfather g1 = new Grandfather();
		g1.myLand();
	}

}
