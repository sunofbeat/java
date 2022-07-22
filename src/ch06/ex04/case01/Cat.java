package ch06.ex04.case01;

public class Cat extends Animal{
	private int age;
	//파라미터없는 생성자가 없으면 컴파일 애러
	
	//파라미터 생성해주고 super(변수명)
	public Cat(String name, int age) {
		super(name);       //this는 super 호출문으로 생성해준다.
	//	this.name = name; //name은 private여서 접근불가
		this.age = age;
	}

	public int getAge() {
		return this.age;
	} 
	
//	public Cat() {  //Animal의 생성자를 그대로 가져온 상황
//		super("야코미");  
//	}
	
}
