package ch04.home.ex02;

import java.util.Scanner;

public class H02Season2 {
	public static void main(String[] args) {
		//�������§�ڵ�
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��:");
		month = sc.nextInt();
		
		if(3 <= month && month <= 5) season = "��";
		else if(6 <= month && month <= 8) season = "����";
		else if(9 <= month && month <= 11) season = "����";
		else if(month == 12 || 1 <= month && month <=2) season = "�ܿ�";
		else season = "�������� �ʴ� ��";
		
		System.out.printf("%d���� %s�Դϴ�.", month, season);
	}
}
