package ch06.ex01.case03;

public class Main {

	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();
		
		leopard.eat();
		lion.shout();

		//lion.eat();
		//leopard.shout();
	}
}
