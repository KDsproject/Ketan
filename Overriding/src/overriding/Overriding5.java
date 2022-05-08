package overriding;

class Nxtra{
	public void Ketan(){
		System.out.println("Ketan is working in Nxtra");
	}
}

class Virtuso extends Nxtra{
	public void Vijay() {
		this.Ketan();
		System.out.println("vijay is working in Virtuso");
	}
}
public class Overriding5 {

	public static void main(String[] args) {
		Virtuso v1 = new Virtuso();
		v1.Vijay();

	}

}
