package ch07.ex06.case03;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Tiger());
		zoo.add(new Falcon());
		
		zoo.clear();
		zoo.add(Cosmos.getAnimal("ȣ����"));
		zoo.add(Cosmos.getAnimal("��"));
		
		for(Animal animal: zoo) {
			animal.eat();
			animal.move();
		}
	}
}
