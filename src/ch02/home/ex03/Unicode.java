package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		//����] �Է��� ������ unicode�� ����϶�.
		//
		//����: A
		//A�� unicode�� 65�Դϴ�.
		Scanner sc = new Scanner(System.in);

		System.out.print("����: ");
		char ch = sc.nextLine().charAt(0);
		int uni = ch;
		System.out.println(ch+"�� unicode�� " + uni + "�Դϴ�.");
	
	}

}		
// 		String str = "";
//		char ch = 0;
//		int i = 0;
//		
//		System.out.print("����: ");
//		str = sc.nextLine();
//		ch = str.charAt(i);
//		i = (int)ch;
//		System.out.println(i);
