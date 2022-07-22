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
과제] 3만원짜리 물건값을 치뤄라.
지갑에 5만원권은 없다.
꺼낸 돈의 권(종류)을 구별하지 않는다.
지갑에서 지폐를 여러번 꺼낸다.
한번에 3만원 이하를 꺼낸다.
꺼낼때마다, 꺼낸 금액을 출력한다.

12000
2000
6000
10000

30000원을 꺼냈습니다.
*/