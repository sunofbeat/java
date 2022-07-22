package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x: ");
		double d = sc.nextDouble();
		
		d = d - d % 1;   //d = (d*10-1)/10;
		System.out.printf("%.1f", d);

	}

}
/*
 * 연산자를 이용해서, 실수값의 소수점 이하를 내림처리하라.
 * (casting), Math.API를 사용하지않는다.
 * 실수값은 sc.nextDouble()로 입력한다.
 * 
 * --
 * x: 3.1492
 * 3.0
 * */
 