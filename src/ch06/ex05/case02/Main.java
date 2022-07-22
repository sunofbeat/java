package ch06.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(1);
		
		dog.shout();
		System.out.println(dog.getAge());
		//dog.getage()는 Animal에 있는 this.age로 *1000값이나옴
	}
}
