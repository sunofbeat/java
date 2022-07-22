package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo2 {
	public static void main(String[] args) {
		int insert = 0;		
		int ai = 0;	
		String str = "";
		String totstr = "";
		String mystr = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1.가위, 2.바위, 3.보 중에 하나를 내세요.\n>");
		insert = sc.nextInt();
			
		if(insert == 1) {  str = "가위";
		}else {
			if(insert == 2) str = "바위";
			else str = "보";
		}
		ai = (int)(Math.random()*3)+1;
		if((1 == ai && insert == 3) || (2 == ai && insert == 1) || (3 == ai && insert == 2)) 
			totstr = "You win";
		else if ((1 == insert && ai ==3) || (2 == insert && ai == 1) || (3 == insert && ai == 2))
			totstr = "You lose";
		else if (insert == ai) totstr = "무승부";
			
		if(ai == 1) mystr = "가위";
		else if(ai == 2) mystr = "바위";
		else if(ai == 3) mystr = "보";
			System.out.println("You: "+ mystr + "\n" + "Me: " + str + "\n" + totstr);	
	}
}
