package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat("���ڹ�"));
		cats.add(new Cat("���ڹ�"));
		cats.add(new Cat("�����"));
		
		System.out.println(cats);
		for(Cat cat: cats) cat.eat();
	}
}
