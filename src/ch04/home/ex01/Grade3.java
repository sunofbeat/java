package ch04.home.ex01;

import java.util.Scanner;

public class Grade3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0;  //���� �ڸ�
		int onedigit = 0;  //���� �ڸ�
		String grade = "";
		
		System.out.print("����: ");
		score = sc.nextInt();
		
		tenDigit = score / 10;
		onedigit = score % 10;
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(onedigit >= 8 || tenDigit == 10) grade += "+";
			else if(0 <= onedigit && onedigit < 4)grade += "-";
		}

		System.out.println(grade);

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
		
	