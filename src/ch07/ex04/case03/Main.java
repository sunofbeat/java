package ch07.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3];
		
		cats[0] = new Cat("�����");
		cats[1] = new Cat("���ڹ�");
		cats[2] = new Cat("���ڹ�");
		
//		cats[2] = new Dog();
		
		for(Cat cat: cats) System.out.println(cat);
	}
}
