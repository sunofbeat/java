package ch02.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C03Input {

	public static void main(String[] args) throws IOException {
     	Scanner sc = new Scanner(System.in);
//		System.out.print("���ڿ����Է��ϼ���.\n>");
//		String str = sc.nextLine();
//		System.out.print(str +"�� �Է��߽��ϴ�.");
//		System.out.printf("\n%s�� �Է��߽��ϴ�.",str);
//		System.out.print("���ڸ� �Է��ϼ���.\n>");
//		int i = sc.nextInt();
//		System.out.println(i + "�� �Է��߽��ϴ�.");
//		
//		sc.nextLine(); //�������ϸ鼭
//		System.out.print("���ڿ��� �Է��ϼ���.\n>");
//		String str1 = sc.nextLine();
//		System.out.println(str1 + "�� �Է��߽��ϴ�.");
//     	System.out.print("���ڸ� �Է��ϼ���.\n>");
//     	char c = sc.nextLine().charAt(0);   //��������ġ�� ã����
//     	System.out.println(c);
     	
		
		
		//����] <�Էµ����͸�>�� �Է��߽��ϴ�. �� Ȯ�� �޼����� ����Ѵ�.		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
//		System.out.print("\n\n���ڿ��� �Է��ϼ���. \n>");
//		String str1 = br.readLine();
//		System.out.print(str1 +"�� �Է��߽��ϴ�.");
//		System.out.printf("\n%s�� �Է��߽��ϴ�.", str1);
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int j = Integer.parseInt(br.readLine());
		System.out.println(j + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int j2 = Integer.parseInt(br.readLine());
		System.out.println(j2 + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		System.out.println(str + "�� �Է��߽��ϴ�.");
	}

}
