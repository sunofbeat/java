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
		
		System.out.print("점수: ");
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

		
	