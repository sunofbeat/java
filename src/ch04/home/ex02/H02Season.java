package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��:");
		month = sc.nextInt();
		
		if(month > 12 || month == 0) season = "���°���";
		else if(3 <= month && month <=5) season = "��";
		else if(6 <= month && month <=8) season = "����";
		else if(9 <= month && month <=11) season = "����";
		else season = "�ܿ�";

		System.out.println(month + "���� " + season + " �Դϴ�.");
	}
}
