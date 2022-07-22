package ch04.home.ex02;

import java.util.Scanner;

public class H02Season2 {
	public static void main(String[] args) {
		//강사님이짠코드
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월:");
		month = sc.nextInt();
		
		if(3 <= month && month <= 5) season = "봄";
		else if(6 <= month && month <= 8) season = "여름";
		else if(9 <= month && month <= 11) season = "가을";
		else if(month == 12 || 1 <= month && month <=2) season = "겨울";
		else season = "존재하지 않는 월";
		
		System.out.printf("%d월은 %s입니다.", month, season);
	}
}
