package ch04.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C04Season {

	public static void main(String[] args) throws IOException {
		int month = 0;
		String season = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("��: ");
		month = Integer.parseInt(br.readLine());
		
		switch(month) {
		case 3: case 4: case 5:
			season = "��"; break;
		case 6: case 7: case 8: 
			season = "����"; break;
		case 9: case 10: case 11:
			season = "����"; break;
		case 12: case 1: case 2:
			season = "�ܿ�";
		
		}
		System.out.printf("%d���� %s�Դϴ�.", month, season);
	}

}
