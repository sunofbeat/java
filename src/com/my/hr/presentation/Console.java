package com.my.hr.presentation;

import java.time.LocalDate;
import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static void info(String msg) {
		System.out.print(msg + "\n> ");
		
	}
	
	static String inNum(String msg) {
		System.out.print(msg + "\n>");	
		return sc.nextLine().trim();
	}
	
	static void inStr(String msg) {
		System.out.print(msg + "\n>");
		
	}
	
	
	static String inErr(String msg) {
		System.out.print("Error" + msg + "\n");
		return msg;
	}
}
