package ch03.ex04;

public class C02DecimalPoint {

	public static void main(String[] args) {
		double pi = Math.PI;
		
		double shortPi = (int)(pi * 10) / 10.0; //3.14x10�� int������ ��ȯ 31/10=3.1
		System.out.println(shortPi);

		shortPi = (int)(pi * 1000) / 1000.0; 
		System.out.println(shortPi);
		
		shortPi = Math.round(pi * 1000) / 1000.0;//�ݿø�
		System.out.println(shortPi);

	}

}
