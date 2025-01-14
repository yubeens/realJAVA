package project01;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int num2=-8;
		
		int a=5;
		int b=4;
		
		System.out.println(a&b);  //비트연산자 & 
		System.out.println(a|b);  //비트연산자 |
		System.out.println(a^b);  //비트연산자 ^
		
		num<<=2; //왼쪽으로 2칸 => 2x2의2승 = 8
		System.out.println(num);
		
		num>>=2; //8값에서 8/2의2승 = 2
		System.out.println(num);
		
		num2>>=2; //-8 x 2의2승 
		System.out.println(num2);
		
		num2>>>=2; 
		System.out.println(num2); //비트기호칸에 1이 밀려져서 값이 이상해짐
		
	}

}
