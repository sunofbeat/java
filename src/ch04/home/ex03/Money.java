package ch04.home.ex03;

public class Money {
	public static void main(String[] args) {
		int oneTh = (int)(Math.random() * 10000);
		int fiveTh = 0;
		int result = 0; 
		int ranpick = 0;
		String str = "";
		 
		oneTh -= oneTh%1000;
		
		do {
			ranpick = (ranpick%1000);
			ranpick = (int)(Math.random() * 5000);
			ranpick = (int)(Math.random() * 10000);
			System.out.println(result);
			
		}while (result <= 30_000);
	}
}
/*
����] 3����¥�� ���ǰ��� ġ���.
������ 5�������� ����.
���� ���� ��(����)�� �������� �ʴ´�.
�������� ���� ������ ������.
�ѹ��� 3���� ���ϸ� ������.
����������, ���� �ݾ��� ����Ѵ�.

12000
2000
6000
10000

30000���� ���½��ϴ�.
*/