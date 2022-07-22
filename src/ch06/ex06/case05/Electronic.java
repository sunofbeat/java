package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	//interface�� ��ü���� �һ�  //final������ �빮�ڷ�
	public static final int VOLTAGE = 200;
	static final String MAKER_NAME = "�Ｚ";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
}
