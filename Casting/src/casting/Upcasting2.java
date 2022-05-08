package casting;

class Parent100{
	void myHome(){
		System.out.println("Parent Home");
	}
}

class Child100 extends Parent100{
	void myBike(){
		System.out.println("My Bike");
	}
}
public class Upcasting2 {

	public static void main(String[] args) {
		System.out.println("Child class object");
		Child100 c1 = new Child100();
		c1.myHome();
		c1.myBike();
		System.out.println("************************************");
		System.out.println("Parent class object");
		Parent100 p1 = new Parent100();
		p1.myHome();
		
		System.out.println("*********using up casting");
		Child100 c3 = new Child100();
		c3.myBike();
		c3.myHome();
		
	
		Parent100 c4 =(Parent100) c3;  //autoupcasting
		c4.myHome();

		
		
	}

}
