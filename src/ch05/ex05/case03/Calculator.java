package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	//���Ⱑ ���̿� ���� ���ڸ� ���Ѵ�.
	public Paper add(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
		return paper;
	}
}
