package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) { // transparent
		return a + b;
	}
	//�ϳ��� Ŭ������ �̸��� ���� �Ķ���Ͱ� ���� �޼��带 �ΰ� �̻� �����ߴ�
	//overloading
	public int add(int a, int b, int c) {
		return a + b + c;
	}
		
}
