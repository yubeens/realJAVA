package project01;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10; // 10진수
		int num1=5;
		int bNum=0B1010; // 2진수
		int oNum=012; // 8진수
		int hNum=0XA; // 16진수
		
		int bNum2=0B00000000000000000000000000000101;
		int bNum3=0B11111111111111111111111111111011;
		int c=num+num1;
		
		System.out.println(bNum2);
		System.out.println(bNum3);
		System.out.println(bNum2+bNum3);
		System.out.println(c);
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
	}

}
