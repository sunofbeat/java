package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat("�����");
		animals[1] = new Dog("�п���");
		animals[2] = new Dog("��ŭ��");
		
		for(Animal animal: animals)
			System.out.println(animal);
		
		//Object�� �ᵵ ������ Ÿ���� �з��ؼ� �ִ´�
		//ex)�����̸� ���� �ڵ����� �ڵ���..
		Object[] objs = new Object[3];
		objs[0] = new Cat("�����");
		objs[1] = new Dog("�п���");
		objs[2] = new Dog("��ŭ��");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
//�������� Ÿ���� �ִ°��� ���׸�(Generic)�̶�� �Ѵ�
