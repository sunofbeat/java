package ch05.home.ex07.case01;

import java.util.Scanner;

public	class Game {
	private String name;
	
	public static void choice() {
		int playerChoice = 0;
		int appChoice = 0;
		String choice = "";
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1.가위, 2.바위, 3.보\n");
		playerChoice = sc.nextInt();
		
			switch(playerChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("You: " + appChoice);
			appChoice = (int)(Math.random() * 3) + 1;
			switch(appChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			if(1 <= playerChoice && playerChoice <= 3) {
				switch (playerChoice - appChoice) {
				case -2: case 1: 
					result = "You win."; break;
				case -1: case 2:
					result = "You lose."; break;
				case 0:
					result = "Fair.";
				}
				
			System.out.println("Me: " + playerChoice);
		} else {
			result = "ERROR) 1, 2, 3중의 하나를 입력하세요.";
		}
		
		System.out.println(result);
	}
	 	
}
