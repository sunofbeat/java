package ch04.ex03;

public class C03Lunch {

	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		
		while(calorie < 30) {
			food = (int)(Math.random() * 10) + 1;
			
			if(food % 5 == 0) {
				System.out.println("���� ������ ���.");
				break;
			}
			calorie += food;
		}
		System.out.printf("%dkcal.��ŭ �Ծ����ϴ�.", calorie);
	}
}
//30Į�θ��� �Ǹ� ��θ���
//�谡 ������ �Ծ����