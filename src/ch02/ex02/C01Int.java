package ch02.ex02;

public class C01Int {

	public static void main(String[] args) {
		//integer, decimal
		int i =10; //decimal
		System.out.println(Integer.toBinaryString(i));//Integer.toBinaryString(i) 2��������
		
		i = 012; //8���� octal
		System.out.println(Integer.toBinaryString(i));
		
		i=0xA; //hexa
		System.out.println(Integer.toBinaryString(i));
		
		i= 0b1010; //binary
		System.out.println(Integer.toBinaryString(i));
		
		i=1_234_567;
		System.out.println(i + 1);
		
		double j = 1e2; // ������ double���� ���� 10��2����
		System.out.println(j);
	}
	
}
