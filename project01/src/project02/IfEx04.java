package project02;

public class IfEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=85;
		char grad;
		
		switch(score) { //switch구문은 정해진 결과에만 적용가능
		case 90:grad='A'; break;
		case 80:grad='B'; break;
		case 70:grad='C'; break;
		default:grad='F';
		}
		System.out.println(grad);
		
		
		
//		switch(score/10) { ★굳이 switch값으로 표현 하고 싶을 시 10으로 나누면 소수값 제외되며 가능하긴 함.
//		case 10,9:grad='A'; break;
//		case 8:grad='B'; break;
//		case 7:grad='C'; break;
//		default:grad='F';
//		}
//		System.out.println(grad);
		
		
		
		if(score>=90) { //특정범위결과를 표출할땐 switch보다 if문을 사용함
			grad='A';
		}else if(score>=80) { //80~89
			grad='B';
		}else if(score>=70) { //70~79
			grad='C';
		}else { //70미만
			grad='F';
		}
		System.out.println(grad);
	}

}
