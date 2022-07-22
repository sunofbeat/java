package ch02.ex02;

public class C02Char {

	public static void main(String[] args) {
		char c ='A';
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
//		System.out.printf("%c, %s", c, Integer.BYTES);
//		System.out.printf("%c, %s", c, Integer.bitCount(c));
		
		c=65;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c=0x0041;   //유니코드상 A는 0041이고 16진수를 표기하기위해 0x을표기
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c='\u0041';
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		

	}

}
