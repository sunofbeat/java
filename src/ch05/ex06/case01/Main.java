package ch05.ex06.case01;

public class Main {

	public static void main(String[] args) {
		Man.say("I love java.");
		//Man.tell("");  //static�̱⿡ �Ұ�
		
		Man man = new Man();
		man.tell("I Love JAVA.");
//		man.say("HELLO");  //say�� static�����ε� �ν��Ͻ������� �����ɼ� ����
	}
}
