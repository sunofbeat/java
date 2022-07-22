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
과제] 사용자를 생성하라.
사용자의 이름, 나이를 수동 입력받는다.
가입일은 오늘날짜를 자동입력

이름: gambit
나이: 25
가입일 : 현재날짜
*/