package ch04.home.ex05;

public class H02_369 {

	public static void main(String[] args) {
		String str = "";
		for(int a = 1; a <= 9; a++) {
			if(a % 3 == 0) str = "¦";
			else str = "";
			System.out.print(" " + a + "" + str);
			
		}
			for(int i = 1; i <= 9; i++) {			
				for(int j = 0; j <= 9; j++) {
					
				if(j == 1) { 
					System.out.print("\n");
				}
				int result = Integer.parseInt(i+""+j);
				if(i % 3 == 0) str = "¦";
				else if(j % 3 == 0) str = "¦";
				else if(result % 3 == 0) str = "¦¦";
				else str = "";
				System.out.print(" " + i + "" + j + str);
			}
		}
		
	}
}


/*
����] 369������ �϶�.
���ڴ� 1�̻� 99����
10���� �ٹٲ����Ѵ�.
--

1 2 3¦ 4 5 6¦ 7 8 9¦ 10
11 12 ....             20
21
...
91¦ 92¦ 93¦¦ ....  99¦¦
*/