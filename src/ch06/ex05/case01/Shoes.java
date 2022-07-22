package ch06.ex05.case01;

public class Shoes extends Product{
	private int price;
	//Produck의 price와 Shoes의 price는 데이터 타입이 다르다.
	public Shoes(int price) {
		super(price);
		this.price = price;
	}
}