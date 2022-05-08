package sample;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname="Ketan Dhende";
		String change = " ";
		String[]Ketan=fullname.split(" ");
		
		for(int i=0; i<Ketan.length;i++)
		{
			change=Ketan[i]+" "+change;
		
		}
		System.out.println(" "+change);

	}

}
