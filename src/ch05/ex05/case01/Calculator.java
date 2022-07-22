package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) { // transparent
		return a + b;
	}
	//하나의 클래스에 이름이 같고 파라미터가 같은 메서드를 두개 이상 선언했다
	//overloading
	public int add(int a, int b, int c) {
		return a + b + c;
	}
		
}
