package ch05.ex01.case03;

public class Main {

	public static void main(String[] args) {
/*		
		User user1 = new User();
		User user2 = new User();
		
		user1.name = "±è¼±È£";
		user1.age = 32;
		
		user2.name = "ÇÑ¾Æ¸§";
		user2.age = 33;
		*/
		//Ä¸½¶È­
		User user = new User();
		user.setName("±è¼±È£");
		user.setAge(33);	
		
		user.setName("ÇÑ¾Æ¸§");
//		user.name = "¾ç½ÂÀÏ";
		
		System.out.printf("%s, %d\n", user.getName(), user.getAge());
//		System.out.printf("%s, %d\n", user.name, user.age);
	}
}
