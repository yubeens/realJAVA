package project01;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 3개를 입력받아 가장 큰 수를 출력하시오.
				Scanner sc=new Scanner(System.in);
				System.out.println("숫자 3개를 입력하세요");
				
				int a =sc.nextInt();
				int b =sc.nextInt();
				int c =sc.nextInt();
				
				if(a>b) {
					if(a>c) {
						System.out.println("가장 큰수는 "+a+"입니다.");
					} else {
						System.out.println("가장 큰수는 "+c+"입니다.");
					}
				}else {
					if(b>c) {
						System.out.println("가장 큰수는 "+b+"입니다.");
					}else {
						System.out.println("가장 큰수는 "+c+"입니다.");
					}
				}
	}

}
