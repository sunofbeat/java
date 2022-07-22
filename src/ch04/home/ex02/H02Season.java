package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월:");
		month = sc.nextInt();
		
		if(month > 12 || month == 0) season = "없는계절";
		else if(3 <= month && month <=5) season = "봄";
		else if(6 <= month && month <=8) season = "여름";
		else if(9 <= month && month <=11) season = "가을";
		else season = "겨울";

		System.out.println(month + "월은 " + season + " 입니다.");
	}
}
