package casting;

class JDK{
	void Print() {
		System.out.println("JDK Print method");
	}
}

class java extends JDK{
	void PrintJAVA() {
		System.out.println("Print JAVA Method");
	}
}
public class Casting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JDK j1 = new java();
		j1.Print();
		
		
		java j2 = (java) j1;				//downcast
		j2.Print();
		j2.PrintJAVA();
		
		
		System.out.println("*********Downcast**********");
		java j3 = new java();								//downcast
		j3.Print();
		j3.PrintJAVA();
		
		
	}

}
