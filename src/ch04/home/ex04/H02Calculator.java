package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		String op = "";
		String msg = "";
		
		do {
			System.out.print("a: ");
			a = sc.nextInt();
			System.out.print("op: ");
			op = sc.next();	
			System.out.print("b: ");
			b = sc.nextInt();
			
			switch(op) {
			case "+": op = "+"; result = a + b; break;
			case "-": op = "-"; result = a - b; break;
			case "*": op = "x"; result = a * b; break;
			case "/": op = "/"; result = (int)a / b;
			}
			
			System.out.println(a + " " + op + " " + b +" = " + result);
			System.out.println("계속 하시겠습니까(y/n)? \n>");
			msg = sc.next();
						
		}while(!msg.equals("n"));
		System.out.println("계산 끝.");
	}
}
/*
과제] 계산기를 만들어라.
연산자는 +, -, *, /이다
/는 몫만을 얻는다.
 * 
 * --
 * a: 1
 * op: +
 * b: 2
 * 1 + 2 = 3
 * 계속하시겠습니까 (y/n)?
 * 
 */
