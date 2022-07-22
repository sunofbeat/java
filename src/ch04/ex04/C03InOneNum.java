package ch04.ex04;

import java.util.Scanner;

public class C03InOneNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		String inputstr = "";
		do {
			System.out.println("입력: ");
			input = sc.nextInt();
			
		}while (!(1 <= input && input <=9)); //1의자리수이면 반복문 종료

		System.out.println("끝.");
	}
}
