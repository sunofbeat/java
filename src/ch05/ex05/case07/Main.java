package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		retailer.sell(farmer.sell(1000));
		
	}
}
//��ΰ� ��Ȯ���ؼ� ������ 1000��å���Ѵ�
//������ڴ� 2000���� �Ǵ�
