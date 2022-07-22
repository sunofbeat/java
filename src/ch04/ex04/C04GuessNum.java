package ch04.ex04;

import java.util.Scanner;

public class C04GuessNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = 0;
		int guess = 0;
		int tries = 0;
		String msg = "";
		
		target = (int)(Math.random() * 1000) + 1;
		
		do {
			System.out.print("����.: ");
			guess = sc.nextInt();
			tries++;
			
			if(guess > target) msg = "Down.";
			else if(guess < target) msg = "Up.";
			else msg = "Great.";
			System.out.println(msg);
		} while(guess != target);
		
		System.out.println(tries + "����" + guess + "�� ������ϴ�.");
	}

}
