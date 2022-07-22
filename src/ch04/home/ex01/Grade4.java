package ch04.home.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Grade4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int score = 0;
		int tendigit = 0;
		int onedigit = 0;
		String grade = "";
		
		System.out.print("����: ");
		score = Integer.parseInt(br.readLine());
				
		tendigit = score / 10;
		onedigit = score % 10;
		
		if(tendigit >= 9) grade = "A";
		else if(tendigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if((onedigit >= 8) || tendigit == 10)grade += "+";
			else if(0 <= onedigit && onedigit <4)grade += "-";		
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

		
	