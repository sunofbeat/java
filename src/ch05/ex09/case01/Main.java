package ch05.ex09.case01;

public class Main {

	public static void main(String[] args) {
		new Init();
		new Init();
		new Init(1);
		//생성자는 콜하면 실행되고 안하면 안된다
		//인스턴스블럭은 항상실행
	}//인스턴스블럭이 먼저 실행되고 생성자블럭가 나중에 실행된다.
}
