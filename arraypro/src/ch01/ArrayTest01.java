package ch01;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray; //4byte
		intArray=new int[10];
		double[] dArray=new double[10];
		char[] chArray=new char[26];
		
		System.out.println(intArray);
		System.out.println(dArray);
		System.out.println(chArray);
		
		int testArray[]= {1,2,3,4,5};
		
		
//		new int[5];
//		testArray[0]=1;
//		testArray[1]=2;
//		testArray[2]=6;
//		testArray[3]=4;
//		testArray[4]=5;
		
		
		
		for(int i=0; i<10; i++) {
			System.out.println(dArray[i]);
		}
		
		char ch='A';
		for(int i=0; i<26; i++) {
			chArray[i]=ch++;
			System.out.println(chArray[i]);
		}
		
//		intArray[0]=10;
//		intArray[5]=20;
//		intArray[9]=60;
//		intArray[10]=100; 오류
		
		for(int i=0; i<10; i++) {
			System.out.println(intArray[i]);
		}
	}

}
