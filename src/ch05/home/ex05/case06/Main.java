package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		Phone phone = new Phone();
		
		phone.setMakerName("�Ｚ");
		phone.setPrice(1_000_000);
		
		person.setName("���Ѽ�");
		
		person.setPhone(phone);
		
		person.sendMsg();
		person.call();
		person.playGame();
	}
}
/*
 * ���Ѽ��� �Ｚ���� 1�鸸�� �ְ� ����ϴ�.
 * �տ� �� ���� ���� �幵�մϴ�.
 * 
 * �޼����� �������ϴ�.
 * ������ ����, ��ȭ�� �ɾ�� , ������ �ȵǳ׿�.
 * ��õڿ� �ٽ� ������ ���̴ϴ�.
 * ��ٸ��� ���� ������ ������ �մϴ�.
 */
//���� ����
//�ڵ����ȿ� �޼��� ��ȭ ����