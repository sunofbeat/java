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
 * �����ڸ� �̿��ؼ�, �Ǽ����� �Ҽ��� ���ϸ� ����ó���϶�.
 * (casting), Math.API�� ��������ʴ´�.
 * �Ǽ����� sc.nextDouble()�� �Է��Ѵ�.
 * 
 * --
 * x: 3.1492
 * 3.0
 * */
 