package ch07.ex08.Presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static int inNum(String msg) {
		System.out.print(msg + "\n> ");
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
}
