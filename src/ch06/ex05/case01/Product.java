package ch06.ex05.case01;

public class Product {
	private int price;
	//Produck의 price와 Shoes의 price는 데이터 타입이 다르다.
	public Product(int price) {
		this.price = price * 2;
	}

	public int getPrice() {
		return this.price;
	}	
}
