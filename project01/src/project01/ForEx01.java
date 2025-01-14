package project01;

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		double dnum1 = 1;
		
		for(int i = 0; i < 10000; i++) {
			dnum1 = dnum1 + 0.1;
		}							//실수의 특징 - 0자체를 정확하게 저장하지 못함
		System.out.println(dnum1);  //부동 소수점 방식에서는 약간의 오차가 발생할 수 있음
	}

}
