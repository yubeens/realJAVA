package project02;

public class WhileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int sum=0;
		
		while(num<=10) {
			sum+=num;
			num++;
			System.out.println("sum="+sum);
			System.out.println("num="+num);
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum);
	}

}
