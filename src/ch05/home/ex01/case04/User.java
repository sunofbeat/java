package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private	String name;
	private	int age;
	private	LocalDate joinDay;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getJoinDay() {
		return joinDay;
	}
	
	public void setJoinDay(LocalDate joinDay) {
		this.joinDay = joinDay;
	}
	
}
/*
����] ����ڸ� �����϶�.
������� �̸�, ���̸� ���� �Է¹޴´�.
�������� ���ó�¥�� �ڵ��Է�

�̸�: gambit
����: 25
������ : ���糯¥
*/