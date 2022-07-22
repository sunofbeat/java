package ch07.ex03.presentation;

import ch07.ex03.domain.User;
import ch07.ex03.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		String userName = Console.inStr("ȸ������ �Է��ϼ���.");
		userService.addUser(new User(userName));
		
		Console.info(userService.getUser() + "�� �����߽��ϴ�.");
	}
}
