package ch05.ex08.case03;

public class Main {
	public static void main(String[] args) {
		Citrus citrus = new Citrus();

//		citrus = new Citrus("������");
		System.out.println(citrus.getName());
		
		Citrus citrus1 = new Citrus();
		Citrus citrus2 = new Citrus("õ����");
		System.out.println(citrus1.getName());
		System.out.println(citrus2.getName());
	}
}
