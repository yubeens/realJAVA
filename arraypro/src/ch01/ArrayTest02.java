package ch01;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]=new int[5];
		int myArray[]=intArray;
		
		intArray[0]=10;
		System.out.println(myArray[0]);
		myArray[0]=20;
		System.out.println(intArray[0]);
		
	}

}
