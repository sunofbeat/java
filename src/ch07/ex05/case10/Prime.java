package ch07.ex05.case10;

public class Prime implements Autobot{
	@Override
	public void run() {
		System.out.println("������ �޸���.");
	}
	
	@Override
	public void fight() {
		System.out.println("������ �ο��.");
	}
	
	public void command() {
		System.out.println("������ �����ϴ�.");
	}
}
