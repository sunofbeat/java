package ch06.ex04.case01;

public class Cat extends Animal{
	private int age;
	//�Ķ���;��� �����ڰ� ������ ������ �ַ�
	
	//�Ķ���� �������ְ� super(������)
	public Cat(String name, int age) {
		super(name);       //this�� super ȣ�⹮���� �������ش�.
	//	this.name = name; //name�� private���� ���ٺҰ�
		this.age = age;
	}

	public int getAge() {
		return this.age;
	} 
	
//	public Cat() {  //Animal�� �����ڸ� �״�� ������ ��Ȳ
//		super("���ڹ�");  
//	}
	
}
