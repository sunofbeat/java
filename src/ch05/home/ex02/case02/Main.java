package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "";
		String writerName = "";
		
		Paper paper = new Paper();
		
		System.out.print("�޼��� : ");
		paper.setMsg(sc.nextLine());
		System.out.print("�ۼ��ڸ� : ");
		paper.setWriterName(sc.nextLine());
		
		System.out.printf("\n%s from %s", paper.getMsg(), paper.getWriterName());		
	}
}
/*
����] ���̿� �޼����� �ۼ��ڸ��� ����϶�.
--

�޼��� : hello
�ۼ��ڸ�: terry

hello from terry.
�ۼ��ڴ� ��ü�̰� �ۼ��ڸ��� �Ӽ��̴�.
*/

