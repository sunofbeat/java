package ch05.ex08.case02;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("���Ѽ�", 25, LocalDate.now());
		
		User user2 = new User();
		user2.setName("�����");
		user2.setAge(35);
		user2.setRegDate(LocalDate.now());
		
		System.out.printf("%s %d %s\n", user1.getName(), user1.getAge(), user1.getRegDate());
		System.out.printf("%s %d %s", user2.getName(), user2.getAge(), user2.getRegDate());
	}
}
