package ch07.ex07.case05;

public class Main {
	public static void main(String[] args) {
		Janitor<Building> janitor1 = a -> System.out.println(a + ", û���մϴ�.");
		Janitor<Car> janitor2 = b -> System.out.println(b + ", û���մϴ�.");
		
		janitor1.clean(new Building());
		janitor2.clean(new Car());
	}
}
