package ch03.home.ex06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ID2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("주민번호: ");
		
		String str = br.readLine();
		char ch = str.charAt(7);
		
		
		if( ch == '1' ) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다. ");
		}
		
		
		
				
		

	}

}
/*
주민등록번호를 입력한다.
남녀를 판단해서 출력한다.
--

주민등록번호: 201514 - 1230452
출력 : 남자입니다.
*/