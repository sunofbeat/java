package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int score = sc.nextInt();
		String strgrade = "";
		
		if(100 >= score && score >= 98) strgrade = "A+";
		else if (score >= 94) strgrade = "A";
		else if (score >= 90) strgrade = "A-";
		else if (score >= 88) strgrade = "B+";
		else if (score >= 84) strgrade = "B";
		else if (score >= 80) strgrade = "B-";
		else strgrade = "C";
		
		System.out.println(strgrade);
	}
}
/*
���� �������� ������ �ο��϶�.
98 �̻� A+
94 �̻� A
90 �̻� A-
88 �̻� B+
84 �̻� B
80 �̻� B-
80 �̸� C 

--
����: 100
A+
*/