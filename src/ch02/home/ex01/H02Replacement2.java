package ch02.home.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H02Replacement2 {

	public static void main(String[] args) throws  IOException {
		//a,b변수의 값을 교체하라
		//a,b값을 임의로 입력받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a값을 입력하세요.\n>");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b값을 입력하세요.\n>");
		int b = Integer.parseInt(br.readLine());
		
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("a의 입력값은"+ a + " 입니다.");
		System.out.println("b의 입력값은"+ b + " 입니다.");
	}

}
