package ch02.ex02;

public class C02Char {

	public static void main(String[] args) {
		char c ='A';
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
//		System.out.printf("%c, %s", c, Integer.BYTES);
//		System.out.printf("%c, %s", c, Integer.bitCount(c));
		
		c=65;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c=0x0041;   //�����ڵ�� A�� 0041�̰� 16������ ǥ���ϱ����� 0x��ǥ��
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c='\u0041';
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		

	}

}
