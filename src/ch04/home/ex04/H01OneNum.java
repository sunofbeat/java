package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		String s = "";
		do {
			System.out.println("입력: ");
			s = sc.nextLine();
			input = Integer.parseInt(s);
		
		}while (!(1 <= input && input <=9)); //1의자리수이면 반복문 종료
		
		System.out.println("끝.");
			
	}
}
//!(1 <= input && input <=9)