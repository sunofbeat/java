package com.my.hr.presentation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.my.hr.domain.User;
import com.my.hr.service.UserService;
import com.my.hr.service.UserServiceImpl;

public class UserIo {
	private UserService userService;
 
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	
		List<User> users = new ArrayList<>();
		boolean isGood;
		String choice;
		String userName;
		String modUserName;
		int userId;
		
		
		
		Scanner sc = new Scanner(System.in);
	
		public void play() {
		
			do {
				
				Console.info("1.���, 2.�߰�, 3.����, 4.����, 0.����");
				choice = sc.nextLine().trim();
			
				if(choice.length() == 1 && '1' <= choice.charAt(0) && choice.charAt(0) <= '4') 
					isGood = true;
				else Console.inErr("���� �� ���ڷ� �Է��ϼ���"); 
				
				
			
			switch(choice) {
			case "1": listUser(); break;
			case "2": addUser(); break;
			case "3": updateUser(); break;
			case "4": deleUser();
				}
			
			}while(!isGood);
		}
		
			private void listUser() { //���
				
					
					if(userService.getUsers().size() == 0) {
					Console.info("����� �����ϴ�.\n�ٽ� �����ϼ���.");
						 isGood = false;
					}else {
						System.out.println("  ID |  �����  |  ������ ");
						
						for(User user: userService.getUsers())
							System.out.println(user);
						isGood = false;
						System.out.println();
					}
			
			}
			
			
			private void addUser() { //�߰�
				
					
					Console.inStr("������� �Է��ϼ���.");
						userName = sc.nextLine().trim();								
						
						if(1 <= userName.length() && userName.length() <= 5) {
						}else Console.inErr("�ټ��ڸ� ���Ϸ� �̸��� �Է��ϼ���");
						
				
				
					Console.info("�������� YYYY-MM-DD �������Է��ϼ���.\n��");
					
					int year = sc.nextInt(); sc.nextLine();
					System.out.print("��\n> ");
					int month = sc.nextInt(); sc.nextLine();
					System.out.print("��\n> ");
					int day = sc.nextInt(); sc.nextLine();
					LocalDate regDate = LocalDate.of(year, month, day);
					
					userId++;
					Console.info(new User(userName, userId, regDate) + "�� �����߽��ϴ�.");
					userService.addUser(new User(userName, userId, regDate));
			
				isGood = false;
				System.out.println();
			}
		

			public void updateUser() { //����
				System.out.println("  ID |  �����  |  ������ ");
				
				for(User user: userService.getUsers())
					System.out.println(user);
				Console.info("������ ����� ���̵� �Է��ϼ���");
					userId = sc.nextInt(); sc.nextLine();
					
					if(userService.getUsers().size() == 0)
						Console.inErr("������ ����� ID�� �����ϴ�.");
						isGood = true;
					
						if(userId == userService.getUsers().indexOf(userId))
						Console.info(userService.getUsers().indexOf(userId)+"��");
					isGood = false;
					System.out.println();
			}

			public void deleUser() { //����
				
			}
	
}
