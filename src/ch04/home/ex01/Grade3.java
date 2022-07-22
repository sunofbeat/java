package ch04.home.ex01;

import java.util.Scanner;

public class Grade3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0;  //십의 자리
		int onedigit = 0;  //일의 자리
		String grade = "";
		
		System.out.print("점수: ");
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
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C 

--
점수: 100
A+
*/	
		
	