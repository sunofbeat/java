package ch05.ex01.case03;

//encapsulation
public class User {
	//class를 생성하면 heap에 생성
	private String name;  //private 나만의것
	private int age; //멤버변수
	
	//메서드 선언부
	//setter
	public void setName(String name) {
		//stack에 생성  지역변수기때문
		this.name = name; //this = member variable를 불러옴
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	// getter
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}
