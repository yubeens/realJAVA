package project02;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3~5 : 봄, 6~8 : 여름, 9~11: 가을, 12~2: 겨울
				int month = 4;
				String season=""; //기본 데이터형이 아니라 초기화를 해주지 않으면 오류남, 스위치문 밖에서는 인식을 하지 못함
				
				switch(month) {
				case 3,4,5:season="봄"; break;
				case 6,7,8:season="여름"; break;
				case 9,10,11:season="가을"; break;
				case 12,1,2:season="겨울";break;
				default:System.out.println("잘못 입력하였습니다.");
				}
				System.out.println(season);
	}

}
