package ch01;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {10,73,8,45,52};
		System.out.println(intArray.length);
		
		int max=0;
		
		//제일 큰 수 출력 : for-each문
		for(int num:intArray) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println(max);
		max=0;
		
		//제일 큰 수 출력 
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i]>max) {
				max=intArray[i];
			}
		}
		System.out.println(max);
				
		
		// 총 합의 평균 구하기 : for-each문
		int sum=0;
		for(int num:intArray) {
			sum+=num;
		}
		double avg=(double)sum/intArray.length;
		System.out.println("avg="+avg);
		
		// 총 합의 평균 구하기
		sum=0;
		for(int i=0; i<intArray.length; i++) {
			sum+=intArray[i];
		} 
		avg=(double)sum/intArray.length;
		System.out.println("avg="+avg);
		
	}

}
