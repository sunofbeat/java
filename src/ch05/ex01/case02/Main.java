package ch05.ex01.case02;

public class Main {

	public static void main(String[] args) {
		String name = "김선호";
		int age = 33;
		System.out.printf("%s는 %d살입니다.\n", name, age);
		
		User user = new User();
		user.name = "김선호";
		user.age = 33;
		System.out.printf("%s는 %d살입니다.", user.name, user.age);
	}
}
