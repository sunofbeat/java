package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("human say.");
		
		human.say();
		Human.walk();
		human.sleep();
		
		human = new Student();
		human.say();
//		human.walk();
		human.sleep();
	}
}
