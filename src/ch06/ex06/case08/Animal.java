package ch06.ex06.case08;

public interface Animal {
	//interface�ȿ� �޼��忡�� ���� �Ҽ� ���µ� default���������ڸ� �����ϸ�
	//default�޼����� �Ѵ�.
	default void eat() {
		System.out.println("������ �Դ�.");
	}
	void move();
	
}
