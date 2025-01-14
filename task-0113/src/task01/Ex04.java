package task01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		소문자 알파벳을 하나 입력받아서 다음과 같은 결과가 나타나도록 코드를 작성하시오.
//		소문자 알파벳 하나를 입력하시오>> e
//		abcde
//		abcd
//		abc
//		ab
		
		Scanner sc= new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력하세요.");
		char inputChar = sc.next().charAt(0); //알파벳 문자열의 첫번째 문자를 가져옴
		
		if(inputChar < 'a' || inputChar > 'z') { //소문자 알파벳 외 다른걸 입력하였을 때 return
			System.out.println("잘못 입력하였습니다. (소문자 알파벳 하나를 입력하세요.)");
			return;
		}
		
		for(int i = inputChar; i>= 'a'; i--) {  //입력받은 값을 초기값으로 주고 그 값(문자열)에서 역순으로 반복 
			for(char c='a'; c <= i; c++) { // 위 조건을 받아 'a'문자열부터 증감시킨 값을 출력
				System.out.print(c); 
			}
			System.out.println();
		}
		
		sc.close();
	}

}
