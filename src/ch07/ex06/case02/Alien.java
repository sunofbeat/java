package ch07.ex06.case02;

public class Alien extends Life{
	//@Override
	//static메서드는 Override가 불가하다
	//instance멤버 변수가 아니기 때문
	public static void eat() {
		System.out.println("Alien 먹다.");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien 소리치다.");
	}
}
