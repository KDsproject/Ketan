package oopss;

class A {
	static int a = 10;
	static int b = 20;
	double c = 13.45;
}
class B {
	static int x = 30;
	int y = 40;
	double z = 53.45;
}
class C {
	static int p = 50;
	int q = 60;
	double r = 66.45;
}
public class Inheritance {

	public static void main(String[] args) {
		System.out.println(A.a);
//		System.out.println(A.b);
		System.out.println(B.x);
		System.out.println(C.p);
		A ref = new A();
		System.out.println(ref.b);
		System.out.println(ref.c);
		B ref1 = new B();
		System.out.println(ref1.y);
		System.out.println(ref1.z);
		C ref2 = new C();
		System.out.println(ref2.p);
		System.out.println(ref2.r);

	}

}
