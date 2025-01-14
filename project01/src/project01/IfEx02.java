package project01;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//월을 입력하면 계절을 출력하시오.
				Scanner sc=new Scanner(System.in);
				System.out.println("월을 입력하세요.");
				
				int month=sc.nextInt();
				
				if(month<1 || month>12) {
					System.out.println("월을 잘못 입력하였습니다.");
				}else {
				
					if (month>=3 && month<=5) 
						System.out.println("봄");
					else if(month>=6 && month<=8)
						System.out.println("여름");
					else if(month>=9 && month<=10)
						System.out.println("가을");
					else
						System.out.println("겨울");
				}
	}
}
