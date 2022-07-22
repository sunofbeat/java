package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	
	public static String inStr(String msg) {
		boolean isGood = false;
		String val = null;
		
		do {
			Console.inMsg(msg);
			val = sc.nextLine().trim();
			
			if(val.length() > 0) isGood = true;
			else Console.err("�ѱ��� �̻� �Է��ϼ���. ");
		}while(!isGood);
		
		return val; 
	}
	
	public static int inNum(String msg) {
		int val = 0;
		String valStr = null;
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			valStr = sc.nextLine().trim();
			
			if(valStr.length() == 1 &&
					'1' <= valStr.charAt(0) && valStr.charAt(0) <= '9') {
				val = Integer.parseInt(valStr);
				isGood = true;
			}else Console.err("���ڸ� �ڿ����� �Է��ϼ���.");
		} while(!isGood);
		
		return val;
	
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println(msg);
	}
}
