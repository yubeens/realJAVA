package project01;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("내용을 입력하세요.");
		
		String str=sc.next();
		str = str.toUpperCase();
		System.out.println(str);
		
		String scanner=sc.next();
		scanner = scanner.toUpperCase();
		System.out.println(scanner);
		
		String s=sc.next();
		char ch=s.charAt(0); //
		System.out.println((char)(ch-32));
	}

}
