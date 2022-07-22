package ch06.ex06.case08;

public interface Animal {
	//interface안에 메서드에는 블럭을 할수 없는데 default접근제어자를 선언하면
	//default메서드라고 한다.
	default void eat() {
		System.out.println("입으로 먹다.");
	}
	void move();
	
}
