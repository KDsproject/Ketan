package Kd;

public class Factors {

	public static void main(String[] args) {
		int i=0;
	static void factor(int num)
		{
			if(num>0){
				
				for(i=0;i<=num;++i){
					if(i==0) {
						continue;
						
					}else if(num%i==0) {
						System.out.println(i+"");
						
					}
				}
			}
//		}else {
//			for(int i =num; i<=Math.abs(num);++i) {
//				if(i==0) {
//					continue;
//					
//				}else {
//					if(num%i==0)
//					{
//						System.out.println(i+" ");
//					}
//				}
//			}
		}

	}

}
