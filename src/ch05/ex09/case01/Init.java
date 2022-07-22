package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static {//�� �ѹ��� �˸��� ���������� static���� ������ȴ�
		Init.s = 0;
//		this.i = 1;//this��� ������ ���⶧��.
		System.out.println("static{}");
	}
	
	//�ν��Ͻ��� �����ɶ�
	{
		Init.s = 1;
		this.i = 1;
		System.out.println("{}");
	}
	
	public Init() {
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	}
	
	public Init(int i) {
		Init.s = i;
		this.i = i;
		System.out.println("Init(int)");
	}

}
