package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	//계산기가 종이에 적힌 숫자를 더한다.
	public Paper add(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
		return paper;
	}
}
