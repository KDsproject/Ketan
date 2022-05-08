package Exception;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		
		System.out.println("program starts from here...");
		//1. abnormal statements
		try{
			int i = 10;
		
		int j = i/0;//ArithmeticException
		System.out.println("res: "+j);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("*********my name is exception********");
		//2. abnormal statements
		try{
			int[] empIds=new int[3];
	
		empIds[3]=101;//ArrayIndexOutOfBoundsException 
		}catch(ArrayIndexOutOfBoundsException j) {
			System.out.println(j);
		}
		System.out.println("Exception handled by Mr. Ketan");
		
		//3. abnormal statements
		try{
			String str=null;
			System.out.println(str.length());//NullPointerException  
	    	System.out.println("Java Exception");
		}catch(NullPointerException k) {
			System.out.println(k);
		}
		System.out.println("tork kratos ev");
		//4. abnormal statements
		try{
			String s="abc";  
		int num=Integer.parseInt(s);//NumberFormatException  
		System.out.println("num: "+num);
		}catch(NumberFormatException M) {
			System.out.println("Meau");
		}
		System.out.println("Programs ends here...");

	}

}
