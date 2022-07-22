package ch06.ex06.case10;

public class Main {
	public static void main(String[] args) {
		
		BusCard card = new BusCard() {
			@Override
			public void tagOn() {
				System.out.println("tag On.");
			}
			
			@Override
			public void tagOff() {
				System.out.println("tag Off.");
			}
		};	//명령문이기 대문에 ;을 찍어준다.
		
		card.tagOn();
		card.tagOff();
	}
}
