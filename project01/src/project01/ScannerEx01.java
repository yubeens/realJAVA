package project01;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 이력하세요.");
		String name=sc.next();
		System.out.println("도시를 이력하세요.");
		String city=sc.next();
		System.out.println("나이를 이력하세요.");
		int age=sc.nextInt();
		System.out.println("weight를 이력하세요.");
		double weight=sc.nextDouble();
		System.out.println("결혼여부를 이력하세요.");
		boolean single=sc.nextBoolean();
		
		System.out.println(name);
		System.out.println(city);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(single);
		
		sc.close();
		
	}

}
