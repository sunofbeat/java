package ch06.ex06.case03;

public class Fridge implements Appliance{
	@Override
	public void on() {
		System.out.println("����� �Ѵ�.");
	}

	@Override
	public void off() {
		System.out.println("����� ����.");
	}
}
