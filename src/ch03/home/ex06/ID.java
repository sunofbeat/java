package ch03.home.ex06;

import java.util.Scanner;

public class ID {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ: ");
		
		String str = sc.nextLine();
		char ch = str.charAt(7);
		
		if( ch == '1' ) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�. ");
		}
	
		
		
		
				
		

	}

}
/*
�ֹε�Ϲ�ȣ�� �Է��Ѵ�.
���ฦ �Ǵ��ؼ� ����Ѵ�.
--

�ֹε�Ϲ�ȣ: 201514 - 1230452
��� : �����Դϴ�.
*/