package bloc;

public class Constructor02 {


	Constructor02()
	{
		this('c',25.36);
		System.out.println("******Zero-Param*********");
	}
	Constructor02(int age)
	{
		System.out.println("******int-Param*********");
	}
	Constructor02(char c, double d)
	{
		this(25);
		System.out.println("******char-double-param*********");
	}
	public static void main(String[] args) {
		
		Constructor02 t1=new Constructor02();

}
}
