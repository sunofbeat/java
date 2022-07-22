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
				
				Console.info("1.목록, 2.추가, 3.수정, 4.삭제, 0.종료");
				choice = sc.nextLine().trim();
			
				if(choice.length() == 1 && '1' <= choice.charAt(0) && choice.charAt(0) <= '4') 
					isGood = true;
				else Console.inErr("범위 내 숫자로 입력하세요"); 
				
				
			
			switch(choice) {
			case "1": listUser(); break;
			case "2": addUser(); break;
			case "3": updateUser(); break;
			case "4": deleUser();
				}
			
			}while(!isGood);
		}
		
			private void listUser() { //목록
				
					
					if(userService.getUsers().size() == 0) {
					Console.info("사원이 없습니다.\n다시 선택하세요.");
						 isGood = false;
					}else {
						System.out.println("  ID |  사원명  |  가입일 ");
						
						for(User user: userService.getUsers())
							System.out.println(user);
						isGood = false;
						System.out.println();
					}
			
			}
			
			
			private void addUser() { //추가
				
					
					Console.inStr("사원명을 입력하세요.");
						userName = sc.nextLine().trim();								
						
						if(1 <= userName.length() && userName.length() <= 5) {
						}else Console.inErr("다섯자리 이하로 이름을 입력하세요");
						
				
				
					Console.info("가입일을 YYYY-MM-DD 순으로입력하세요.\n년");
					
					int year = sc.nextInt(); sc.nextLine();
					System.out.print("월\n> ");
					int month = sc.nextInt(); sc.nextLine();
					System.out.print("일\n> ");
					int day = sc.nextInt(); sc.nextLine();
					LocalDate regDate = LocalDate.of(year, month, day);
					
					userId++;
					Console.info(new User(userName, userId, regDate) + "이 가입했습니다.");
					userService.addUser(new User(userName, userId, regDate));
			
				isGood = false;
				System.out.println();
			}
		

			public void updateUser() { //수정
				System.out.println("  ID |  사원명  |  가입일 ");
				
				for(User user: userService.getUsers())
					System.out.println(user);
				Console.info("수정할 사원의 아이디를 입력하세요");
					userId = sc.nextInt(); sc.nextLine();
					
					if(userService.getUsers().size() == 0)
						Console.inErr("수정할 사원의 ID가 없습니다.");
						isGood = true;
					
						if(userId == userService.getUsers().indexOf(userId))
						Console.info(userService.getUsers().indexOf(userId)+"가");
					isGood = false;
					System.out.println();
			}

			public void deleUser() { //삭제
				
			}
	
}
