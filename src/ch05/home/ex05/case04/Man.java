package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Man {
	private String name;
	private int age;
	private LocalDate birthday;
	
	
	
	public void sing() {}
	public void eat() {}
	public void run() {}
	
	//getter�� �ʿ���������
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
		
}
