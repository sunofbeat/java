package ch05.ex03.case01;

public class Main {

	public static void main(String[] args) {
		Tv myTv = new Tv();
		
		System.out.println(myTv);
		
		//��ü�� ���������� �����Ͱ� �ʱ�ȭ��
		System.out.printf("%s, %b, %d\n",
				myTv.getColorl(), myTv.isPower(), myTv.getChannel());
		
		myTv.setColorl("red");
		myTv.setPower(true);
		myTv.setChannel(7);
		
		System.out.printf("%s, %b, %d\n",
				myTv.getColorl(), myTv.isPower(), myTv.getChannel());
	}
}
