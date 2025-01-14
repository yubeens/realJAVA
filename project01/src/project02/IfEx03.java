package project02;

public class IfEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank=3;
		char color;
		switch(rank) {
		case 1: color='G';
		break;
		case 2: color='S';
		break;
		case 3: color='B';
		break;
		default:
			color='A';
		}
		System.out.println(color);
		
		//if-else if-else 구문
		if(rank==1) {
			color='G';
		}else if(rank==2) {
			color='S';
		}else if(rank==3) {
			color='B';
		}else {
			color='A';
		}
		System.out.println(color);
	}

}
