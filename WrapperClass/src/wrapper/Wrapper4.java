package wrapper;

public class Wrapper4 {

	public static void main(String[] args) {
		Integer num=30;
		System.out.println(num);
		int num2= num.intValue();
		System.out.println(num2);
		System.out.println(num2==num);
		
		System.out.println("********************************");
		
		Integer college =50;
		Integer College = new Integer(college);
		System.out.println(college);
		int school = college.intValue();
		System.out.println(school);
		System.out.println(College==school);
	}

}
