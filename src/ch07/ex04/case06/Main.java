package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat("헤롱이");
		animals[1] = new Dog("왈왈이");
		animals[2] = new Dog("성큼이");
		
		for(Animal animal: animals)
			System.out.println(animal);
		
		//Object를 써도 되지만 타입을 분류해서 넣는다
		//ex)동물이면 동물 자동차면 자동차..
		Object[] objs = new Object[3];
		objs[0] = new Cat("헤롱이");
		objs[1] = new Dog("왈왈이");
		objs[2] = new Dog("성큼이");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
//여러가지 타입을 넣는것을 제네릭(Generic)이라고 한다
