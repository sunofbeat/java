package ch04.home.ex01;

import java.util.Scanner;

public class Present {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String prize = "";
		
		System.out.print("1.�����, 2.��Ź��\n> ");
		choice = sc.nextInt();
		
		if(choice == 1) prize = "�����";
		else if(choice == 2) prize = "��Ź��";
		else prize = "ȭ����";
		
		System.out.println(prize);
	}
}
