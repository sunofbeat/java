package ch06.ex03.case02;

public class Cat extends Animal{
	@Override  //annotation  컴파일이 읽을수있는 주석
	public void shout() {
		System.out.println("야옹야옹");
	}
}
