package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		LocalDate joinDate = null;

		System.out.print("이름: ");
		name = sc.nextLine();
		System.out.print("나이: ");
		age = sc.nextInt();
		joinDate = LocalDate.now();
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setJoinDay(joinDate);
		
		System.out.printf("\n이름 : %s\n나이 : %d\n가입일 : %s",
				user.getName(), user.getAge(), user.getJoinDay());
	}
}
/*
과제] 사용자를 생성하라.
사용자의 이름, 나이를 수동 입력받는다.
가입일은 오늘날짜를 자동입력

*/