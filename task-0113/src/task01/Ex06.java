package task01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//		정수를 입력하세요 >>15
//		월
//		정수를 입력하세요>>monday (정수가 입력되지 않아 예외 발생)
//		경고! 수를 입력하지 않았습니다. 
//		정수를 입력하세요 >>-1
//		프로그램을 종료합니다...
		
		char [] day = {'일', '월', '화', '수', '목','금','토'};
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.print("정수를 입력하세요 >>");
		try {
			int input = sc.nextInt();
			if (input <0) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			int index = input % 7;
			System.out.println(day[index]);
		} catch (Exception e){ //try블록에서 발생한 예외 처리를 위한 블록 , Exception클래스는 모든 예외의 상위 클래스 -> 모든 종류의 예외를 처리할 수 있다. 
			System.out.println("경고! 수를 입력하지 않았습니다.");
			sc.next();
		}
	}

	sc.close();;
		
}

}
