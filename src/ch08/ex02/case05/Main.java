package ch08.ex02.case05;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("���Ѽ�", Level.COPPER);
		User user2 = new User("�ѾƸ�", Level.SILVER);
		User user3 = new User("�����", Level.GOLD);
		List<User> users = Arrays.asList(user1, user2, user3);
		
		users.forEach(user -> {
			try {
				user.upgradeLevel();
			}catch(IllegalStateException e) {}
		});
		System.out.println(users);
	}

}
