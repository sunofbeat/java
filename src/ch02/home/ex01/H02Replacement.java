package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {

	public static void main(String[] args) {
		//a,b������ ���� ��ü�϶�
		//a,b���� ���Ƿ� �Է¹޴´�.
		
		//presentation logic
		Scanner sc = new Scanner(System.in);
		System.out.print("a���� �Է��ϼ���.\n>"); 
		int a = sc.nextInt();
		System.out.print("b���� �Է��ϼ���.\n>");
		int b = sc.nextInt();
		
		
		//business logic
		int c = 0;
		c = a; //backup
		a = b;
		b = c;
		sc.close();
		System.out.println("a���Է°���"+ a + " �Դϴ�.");
		System.out.println("b���Է°���"+ b + " �Դϴ�.");
		System.out.printf("=> a: %d, b: %d\n", a,b);
		System.out.println("=>a,b ���� ��ü �մϴ�.");
	}

}
