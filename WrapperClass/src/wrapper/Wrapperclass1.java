package wrapper;

public class Wrapperclass1 {

	public static void main(String[] args) {
		
		char c1='A';
		
		Character charObj1=new Character(c1);// boxing
		System.out.println(c1==charObj1);
		Character charObj2=new Character('y');
		
		Character charObj3='H';// boxing
		
		System.out.println("c1: "+c1);
		System.out.println("charObj1: "+charObj1);
		System.out.println("charObj2: "+charObj2);
		System.out.println("charObj3: "+charObj3);
		
		boolean b=true;
		Boolean bObj=new Boolean(b);
		System.out.println(bObj==b);


	}

}
