package ch02.home.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H02Replacement2 {

	public static void main(String[] args) throws  IOException {
		//a,b������ ���� ��ü�϶�
		//a,b���� ���Ƿ� �Է¹޴´�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a���� �Է��ϼ���.\n>");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b���� �Է��ϼ���.\n>");
		int b = Integer.parseInt(br.readLine());
		
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("a�� �Է°���"+ a + " �Դϴ�.");
		System.out.println("b�� �Է°���"+ b + " �Դϴ�.");
	}

}
