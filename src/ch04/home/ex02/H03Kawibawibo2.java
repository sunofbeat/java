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
		System.out.print("1.����, 2.����, 3.�� �߿� �ϳ��� ������.\n>");
		insert = sc.nextInt();
			
		if(insert == 1) {  str = "����";
		}else {
			if(insert == 2) str = "����";
			else str = "��";
		}
		ai = (int)(Math.random()*3)+1;
		if((1 == ai && insert == 3) || (2 == ai && insert == 1) || (3 == ai && insert == 2)) 
			totstr = "You win";
		else if ((1 == insert && ai ==3) || (2 == insert && ai == 1) || (3 == insert && ai == 2))
			totstr = "You lose";
		else if (insert == ai) totstr = "���º�";
			
		if(ai == 1) mystr = "����";
		else if(ai == 2) mystr = "����";
		else if(ai == 3) mystr = "��";
			System.out.println("You: "+ mystr + "\n" + "Me: " + str + "\n" + totstr);	
	}
}
