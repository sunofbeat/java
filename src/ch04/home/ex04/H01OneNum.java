package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		String s = "";
		do {
			System.out.println("�Է�: ");
			s = sc.nextLine();
			input = Integer.parseInt(s);
		
		}while (!(1 <= input && input <=9)); //1���ڸ����̸� �ݺ��� ����
		
		System.out.println("��.");
			
	}
}
//!(1 <= input && input <=9)