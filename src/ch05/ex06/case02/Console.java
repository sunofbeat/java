package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	//static 블럭  -스태틱변수로 Scanner를 선언했지
	//static블럭 안에서 다시 초기화 가능하다 
	static {
		sc = new Scanner(System.in);
	}
	
	public static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	//사원번호 입력받을때 씀
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
