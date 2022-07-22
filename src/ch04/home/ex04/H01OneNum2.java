package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isGood = false;
		String errMsg = "Error] 한자리 자연수를 입력하세요";
		
		do {
			System.out.print("입력: ");
			input = sc.nextLine();
			if(input.length() == 1 && '0' < input.charAt(0) && input.charAt(0) <= '9') 
				isGood = true;
			else System.out.println(errMsg);
		}while(!isGood);
		
		System.out.println("끝.");
	}
}
//!(1 <= input && input <=9)