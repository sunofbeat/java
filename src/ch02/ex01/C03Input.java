package ch02.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C03Input {

	public static void main(String[] args) throws IOException {
     	Scanner sc = new Scanner(System.in);
//		System.out.print("문자열을입력하세요.\n>");
//		String str = sc.nextLine();
//		System.out.print(str +"를 입력했습니다.");
//		System.out.printf("\n%s를 입력했습니다.",str);
//		System.out.print("숫자를 입력하세요.\n>");
//		int i = sc.nextInt();
//		System.out.println(i + "를 입력했습니다.");
//		
//		sc.nextLine(); //재정의하면서
//		System.out.print("문자열을 입력하세요.\n>");
//		String str1 = sc.nextLine();
//		System.out.println(str1 + "를 입력했습니다.");
//     	System.out.print("문자를 입력하세요.\n>");
//     	char c = sc.nextLine().charAt(0);   //글자의위치를 찾을때
//     	System.out.println(c);
     	
		
		
		//과제] <입력데이터를>를 입력했습니다. 는 확인 메세지를 출력한다.		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
//		System.out.print("\n\n문자열을 입력하세요. \n>");
//		String str1 = br.readLine();
//		System.out.print(str1 +"을 입력했습니다.");
//		System.out.printf("\n%s를 입력했습니다.", str1);
		System.out.print("숫자를 입력하세요.\n>");
		int j = Integer.parseInt(br.readLine());
		System.out.println(j + "를 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n>");
		int j2 = Integer.parseInt(br.readLine());
		System.out.println(j2 + "를 입력했습니다.");
		
		System.out.print("문자열을 입력하세요.\n>");
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		System.out.println(str + "를 입력했습니다.");
	}

}
