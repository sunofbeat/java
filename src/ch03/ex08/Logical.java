package ch03.ex08;

public class Logical {

	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;  //true
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		
		b = (2 > 1) && (2 > 1); //true    ��(&& ||)�� ��(<, >, =)�� ���� ������ �񱳰� ���� �����
		b = 2 < 1 && 2 > 1;    //false
		b = 2 < 1 || 2 > 1;   //true  ||�����ڴ� �ϳ��� true���� true
		b = 2 < 1 || 2 < 1;  //false
		
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);   //b == false
		//&&����������� x���� 1�̰� �̹� false�� ������ y���� ���� ������������
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b", x, y, b); 
		// or|| ������������� ��� ����� ���� �ذ�

		
	}

}
