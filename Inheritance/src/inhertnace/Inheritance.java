package inhertnace;

class Fruit{
	void mango(){
		System.out.println("Mango is fruit");
	}
}

class taste extends Fruit{
	void sweet() {
		System.out.println("Taste is sweet");
	}
}
public class Inheritance {

	public static void main(String[] args) {

		taste t1 = new taste();
		t1.mango();
		t1.sweet();
		
		Fruit f1 = new Fruit();
		f1.mango();
		

	}

}
