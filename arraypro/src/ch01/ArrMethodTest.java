package ch01;

public class ArrMethodTest {
	
	//정수형 배열을 리턴한다.
	static int[] makeArray() {
		int[] arr= {1,2,3,4,5};
		return arr;
	}
	static void showArray(int[] arr) {
		for(int num:arr) {
			System.out.println(num);
		}
	}
	static void changeArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]+=10;
		}
	}
	
	static int sum(int a, int b) {
		a+=10;
		System.out.println("함수안 :"+a);
		return a+b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray=makeArray();
		showArray(intArray);
		changeArray(intArray);
		showArray(intArray);
		
		int num1=10;
		int num2=20;
		int result=sum(num1,num2);
		System.out.println(result);
		System.out.println(num1);
		
//		for(int num: intArray) {
//			System.out.println(num);
		}
	}

