package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		retailer.sell(farmer.sell(1000));
		
	}
}
//농부가 수확을해서 가격을 1000원책정한다
//유통업자는 2000원에 판다
