package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isGood = false;
		String errMsg = "Error] ���ڸ� �ڿ����� �Է��ϼ���";
		
		do {
			System.out.print("�Է�: ");
			input = sc.nextLine();
			if(input.length() == 1 && '0' < input.charAt(0) && input.charAt(0) <= '9') 
				isGood = true;
			else System.out.println(errMsg);
		}while(!isGood);
		
		System.out.println("��.");
	}
}
//!(1 <= input && input <=9)