package casting;

class A{
	void test1() {
		System.out.println("Running Test 1");
	}
}
class B extends A{
	void test2() {
		System.out.println("Running Test 2");
	}
}

class C extends B{
	void test3() {
		System.out.println("Running Test 3");
	}
}
public class Casting3 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test2();
		c1.test3();
		System.out.println("********By using Class B object******");
		B b1 = c1;
		b1.test2();
		b1.test1();
	}

}
