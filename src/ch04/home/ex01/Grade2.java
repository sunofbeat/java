package ch04.home.ex01;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		int score = sc.nextInt();
		String strgrade = "";
		
		if(score >= 98) {
			strgrade = "A+";
		}else if (score >= 94) {
			strgrade = strgrade.concat("A");
		}else if(score >= 90) {
			strgrade = strgrade.concat("A-");
		}else if(score >= 88) {
			strgrade = strgrade.concat("B+");
		}else if(score >= 84) {
			strgrade = strgrade.concat("B");
		}else if(score >= 80) {
			strgrade = strgrade.concat("B-");
		}else strgrade = "C";
		System.out.println(strgrade);
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