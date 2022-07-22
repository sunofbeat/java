package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {

	public static void main(String[] args) {
		//a,b변수의 값을 교체하라
		//a,b값을 임의로 입력받는다.
		
		//presentation logic
		Scanner sc = new Scanner(System.in);
		System.out.print("a값을 입력하세요.\n>"); 
		int a = sc.nextInt();
		System.out.print("b값을 입력하세요.\n>");
		int b = sc.nextInt();
		
		
		//business logic
		int c = 0;
		c = a; //backup
		a = b;
		b = c;
		sc.close();
		System.out.println("a의입력값은"+ a + " 입니다.");
		System.out.println("b의입력값은"+ b + " 입니다.");
		System.out.printf("=> a: %d, b: %d\n", a,b);
		System.out.println("=>a,b 값을 교체 합니다.");
	}

}
