package ch03.ex04;

public class C01Artih {

	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
//		byte c = a + b; //���ϰ��� ���´� int
//		int c = a + b;
		byte c = (byte)(a + b);
		System.out.println(c);
		
//		c = c + 1;
		c++;
		System.out.println(c);
		
		double d = (double)a / b;
		System.out.printf("%.1f\n",d);
		
		d = (double)a / b;   //(double)�� Casting���� 3.0������2.0���� �������
		System.out.println(d);
		
		d = 1.0 * a / b;
		System.out.println(d);
		
		d = (double)(a/b);  //()�ȿ� �ִ� ������ �켱������ �Ǿ� int������int�� �Ǳ⶧�� 1.0
		System.out.println(d);
		
		d = a / b * 1.0;
		System.out.println(d);
	}

}
