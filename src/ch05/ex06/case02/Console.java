package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	//static ��  -����ƽ������ Scanner�� ��������
	//static�� �ȿ��� �ٽ� �ʱ�ȭ �����ϴ� 
	static {
		sc = new Scanner(System.in);
	}
	
	public static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	//�����ȣ �Է¹����� ��
	public static String inStr(String msg) {
		Console.inMsg(msg);
		return sc.nextLine().trim(); //chainning  
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
