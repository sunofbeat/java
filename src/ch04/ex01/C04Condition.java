package ch04.ex01;

public class C04Condition {

	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("Good");
		
		char b = 'b';
		if('a' < b && b < 'c') System.out.println("Good");	
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0)
			System.out.printf("x: %d, y: %d\n", x, y);
		
		//����] s���� he, HE, He, hE ���� �ϳ���, he�� ���϶�.
		String s = "he";
		if(s.equals(s) || s.equals("HE") || s.equals("hE") || s.equals("He"))
			System.out.println("he");
		
		s = "";
		if(s.equals("")) System.out.println("���� ����.");
		
		//����- ���� ������, ���� �ִ�. �� ���϶�
		s = "hello";
		if(!s.equals("")) System.out.println("���� �ִ�.");
		
		boolean power = false;
		if(!power) System.out.println("������ �Ѵ�.");
		
	}
}
