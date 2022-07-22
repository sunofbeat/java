package ch06.ex03.case03;

public class Main {
	public static void main(String[] args) {
		Duck duck = new Duck();
		Hen hen = new Hen();
		
		System.out.println(duck);
		System.out.println(hen);//hashcode가 나옴 override를 안했기때문에
	}
}
