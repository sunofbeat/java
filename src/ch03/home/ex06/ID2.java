package ch03.home.ex06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ID2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ֹι�ȣ: ");
		
		String str = br.readLine();
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