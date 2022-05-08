package day1;

public class methodsnew {
			
		static int mobileNum=123;//non-static Global Variable
			char grade;
			
			public static void main(String[] args) {
				
				methodsnew r1=new methodsnew();
				System.out.println("mobilenum with r1 reference: "+r1.mobileNum);//
				System.out.println("grade with r1 reference: "+r1.grade);// 

				methodsnew x1=new methodsnew();
				System.out.println("mobilenum with x1 reference: "+x1.mobileNum);//
				System.out.println("grade with x1 reference: "+x1.grade);// 

				x1.mobileNum=987;
				x1.grade='A';
				System.out.println("updated, mobilenum with x1 reference: "+x1.mobileNum);//
				System.out.println("updated, grade with x1 reference: "+x1.grade);// 

				System.out.println("mobilenum with r1 reference: "+mobileNum);//
				System.out.println("grade with r1 reference: "+r1.grade);// 
				
			}
		}