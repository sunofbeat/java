package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		LocalDate joinDate = null;

		System.out.print("�̸�: ");
		name = sc.nextLine();
		System.out.print("����: ");
		age = sc.nextInt();
		joinDate = LocalDate.now();
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setJoinDay(joinDate);
		
		System.out.printf("\n�̸� : %s\n���� : %d\n������ : %s",
				user.getName(), user.getAge(), user.getJoinDay());
	}
}
/*
����] ����ڸ� �����϶�.
������� �̸�, ���̸� ���� �Է¹޴´�.
�������� ���ó�¥�� �ڵ��Է�

*/