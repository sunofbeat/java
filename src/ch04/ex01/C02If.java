package ch04.ex01;

public class C02If {

	public static void main(String[] args) {
		int visitCnt = 0;
		
		if(visitCnt < 1) {
			System.out.println("ù �湮 �Դϴ�.");
			visitCnt++;
		}else {
			System.out.println("�� �湮 �Դϴ�.");
		}
		
		
		if(visitCnt < 1) System.out.println("ù �湮 �Դϴ�.");
		else System.out.println("�� �湮 �Դϴ�.");

	}

}