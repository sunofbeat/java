package ch05.ex01.case02;

public class Main {

	public static void main(String[] args) {
		String name = "�輱ȣ";
		int age = 33;
		System.out.printf("%s�� %d���Դϴ�.\n", name, age);
		
		User user = new User();
		user.name = "�輱ȣ";
		user.age = 33;
		System.out.printf("%s�� %d���Դϴ�.", user.name, user.age);
	}
}
