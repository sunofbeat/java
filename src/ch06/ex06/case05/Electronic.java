package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	//interface는 객체생성 불사  //final변수는 대문자로
	public static final int VOLTAGE = 200;
	static final String MAKER_NAME = "삼성";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
}
