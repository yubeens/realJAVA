package ch01;

public class EnumTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enum 상수 - 변하지 않는 값 , 열거형
		enum Week{월,화,수,목,금,토,일}
		Week monday=Week.월;
		System.out.println(monday);
		
		
		//Week값(상수)을 배열 형태로 가지고 오는 법
		Week[] days=Week.values(); 
		
		for(Week day:days) {          
			System.out.print(day);
		}
	}

}
