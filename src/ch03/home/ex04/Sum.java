package ch03.home.ex04;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");  int a = sc.nextInt();
		System.out.print("b: ");  int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
		int minus = a - b;
		System.out.println(a + " - " + b + " = " + minus);
		int multiple = a * b;
		System.out.println(a + " x " + b + " = " + multiple);
		double divi = (double)a / b;
		System.out.printf("%d / %d = %.2f", a, b, divi);
		 
		
		

	}

}
// �� �ڿ����� �Է� �޾�, �� �հ踦 ����϶�.
// a: 1
// b: 1
// 1 + 2 = 3