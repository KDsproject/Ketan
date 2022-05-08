package casting;

class Member{
	long phone;
	void chat() {
		System.out.println("Chat on whatsapp "+phone);
	}
}

class Admin extends Member{
	void call(){
		System.out.println("Call on whatsapp");
	}
}
public class Casting {

	public static void main(String[] args) {
		
		Member m1 = new Admin();
		m1.phone = 735095976;
		m1.chat();
		
		Admin ad1 = (Admin) m1;   //downcast
		ad1.chat();
		ad1.call();
	}

}
