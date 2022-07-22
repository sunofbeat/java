package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int player = 0;
		int appPlayer = 0;
		String result = "";
		String choice = "";
		appPlayer = (int)(Math.random() * 3) + 1;
		System.out.print("1.가위, 2.바위, 3.보\n>");
		player = sc.nextInt();
		
		if(1 <= player && player <=3) {
			switch(player - appPlayer) {
			case 1: case -2:
				result = "You win";
			case -1: case 2:
				result = "You lose";
			case 0:
				result = "Fair";
			}
			
			switch(player) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("You: " + choice);
			switch(appPlayer) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("Me: " + choice);
		}else {
			result = "EORROR 입니다.";
		}
		System.out.println(result);
	}
}
