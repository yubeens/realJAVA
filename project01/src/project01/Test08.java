package project01;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int i=2;
		
		boolean value =((num1=num1+10)<10) && ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //단락회로평가 : 앞의 항이 falses면 뒤 항의 결과를 평가하지 않아도 false
		
		value=((num1=num1+10)>10)||((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 앞의 항이 true면 뒤 항의 결과를 평가하지 않아도 true임
		
	}

}
