package ch04.ex03;

public class C01While {

	public static void main(String[] args) {
		int weight = 88;
		int jumpCnt = 0;
		
		while(weight > 60) {
			jumpCnt++;
			weight--;
		}		
		System.out.printf("%d�� �ٳѱ��ؼ�, ������ %dkg�� �Ǿ����ϴ�.", jumpCnt, weight);
	}

}
