package project02;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("소문자를 입력하여 대문자로 변환합니다.");
			System.out.println("변환할 소문자를 입력하세요, quit을 입력하면 종료합니다.");
			String s=sc.next();
			
			while(!s.equals("quit")) {
				char ch=s.charAt(0);
				System.out.println((char)(ch-32));
				System.out.println("변환할 소문자를 입력하세요, quit을 입력하면 종료합니다.");
				s=sc.next();
			}
			System.out.println("End");
	}

}
