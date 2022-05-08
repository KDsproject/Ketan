package forLoop;

public class countDigit {

	public static void main(String[] args) {

			int count=0;
			
			for(int i =1; i<=20;i++) {
				System.out.println(i);
				count = ++count;
		}
			System.out.println("Total No. of Count is:"+count);
	}

}
