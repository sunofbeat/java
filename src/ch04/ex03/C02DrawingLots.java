package ch04.ex03;

public class C02DrawingLots {
	public static void main (String[] args) {
		int random = 1;
		int pickCnt = 0;
		
		while(random % 3 != 0 ) {
			random = (int)(Math.random() * 100) + 1;
			pickCnt++;
		}
		System.out.printf("%dȸ �̾Ƽ�, %d�� ã�ҽ��ϴ�.", pickCnt, random);
	}
}
//3�� ����� �ƴϸ�, �̾ƾ���