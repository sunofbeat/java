package ch07.ex05.case10;

public class Bumblebee implements Autobot{
	@Override
	public void run() {
		System.out.println("����� �޸���.");
	}
	
	@Override
	public void fight() {
		System.out.println("����� �ο��.");
	}
	
	public void guard() {
		System.out.println("����� ��ȣ�ϴ�.");
	}
}
