package ch06.ex05.case01;

public class Product {
	private int price;
	//Produck�� price�� Shoes�� price�� ������ Ÿ���� �ٸ���.
	public Product(int price) {
		this.price = price * 2;
	}

	public int getPrice() {
		return this.price;
	}	
}
