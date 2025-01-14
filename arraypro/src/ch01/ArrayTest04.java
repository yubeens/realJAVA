package ch01;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray=new int[10];
		
//		int num=(int)(Math.random()*100); // Math.random() : 0~1사이의 실수를 랜덤하게 발생
//		System.out.println(num);
		
		for(int i=0; i<numArray.length; i++) {
			numArray[i]=(int)(Math.random()*100)+1;
			System.out.println(numArray[i]);
		}
		
		for(int num:numArray) {
			num+=10;
			System.out.println(num);
		}
	}

}
