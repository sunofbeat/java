package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.����, 2.����, 3.��\n");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			switch (playerChoice - appChoice) {
			case -2: case 1: 
				result = "You win."; break;
			case -1: case 2:
				result = "You lose."; break;
			case 0:
				result = "Fair.";
			}
			
			switch(playerChoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			System.out.println("Me: " + choice);
		} else {
			result = "ERROR) 1, 2, 3���� �ϳ��� �Է��ϼ���.";
		}
		
		System.out.println(result);
	}
}
