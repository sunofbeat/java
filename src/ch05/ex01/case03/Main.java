package ch05.ex01.case03;

public class Main {

	public static void main(String[] args) {
/*		
		User user1 = new User();
		User user2 = new User();
		
		user1.name = "�輱ȣ";
		user1.age = 32;
		
		user2.name = "�ѾƸ�";
		user2.age = 33;
		*/
		//ĸ��ȭ
		User user = new User();
		user.setName("�輱ȣ");
		user.setAge(33);	
		
		user.setName("�ѾƸ�");
//		user.name = "�����";
		
		System.out.printf("%s, %d\n", user.getName(), user.getAge());
//		System.out.printf("%s, %d\n", user.name, user.age);
	}
}
