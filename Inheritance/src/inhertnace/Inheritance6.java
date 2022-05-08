package inhertnace;

class fruits {
	int fruitage;
	fruits(){
		
		System.out.println("fruits constructor");
	}
	public void taste(int j) {
		System.out.println("taste is sweet");
	}
}

class apple extends fruits {
	int fruitage;
	apple(){
		System.out.println("apples constructor");
	}
	public void taste() {
		System.out.println("Apple is sweet");
	}
	public void shape() {
		fruitage= 20;
		System.out.println("Apple is round in shape");
		System.out.println("Apple fruitage is :"+fruitage);
		System.out.println("fruits fruitage is :"+super.fruitage);
		System.out.println(super.fruitage);
		taste();
		super.taste(4);
	}
}

public class Inheritance6 {

	public static void main(String[] args) {
			apple a1 = new apple();
			a1.shape();
			a1.taste(50);
	}

}
