package ch05.ex01.case03;

//encapsulation
public class User {
	//class�� �����ϸ� heap�� ����
	private String name;  //private �����ǰ�
	private int age; //�������
	
	//�޼��� �����
	//setter
	public void setName(String name) {
		//stack�� ����  ���������⶧��
		this.name = name; //this = member variable�� �ҷ���
		
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
