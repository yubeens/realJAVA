package project01;

import java.util.Scanner;

public class ScannerEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요");
		int score1=sc.nextInt();
		int score2=sc.nextInt();
		
		System.out.println(score1>=70 && score2>=70); //논리연산자 && 두합이 모두 참일때만 true
		System.out.println(score1>=70 || score2>=70); // || 두 항 중 하나의 항만 참이면 true
		System.out.println(!(score1>=70 && score2>=70)); //()안쪽의 결과가 true가되면 !< false , 안의 결과에 따라 출력
		sc.close();
	}

}
