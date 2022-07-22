package ch04.home.ex05;

public class H02_369 {

	public static void main(String[] args) {
		String str = "";
		for(int a = 1; a <= 9; a++) {
			if(a % 3 == 0) str = "Â¦";
			else str = "";
			System.out.print(" " + a + "" + str);
			
		}
			for(int i = 1; i <= 9; i++) {			
				for(int j = 0; j <= 9; j++) {
					
				if(j == 1) { 
					System.out.print("\n");
				}
				int result = Integer.parseInt(i+""+j);
				if(i % 3 == 0) str = "Â¦";
				else if(j % 3 == 0) str = "Â¦";
				else if(result % 3 == 0) str = "Â¦Â¦";
				else str = "";
				System.out.print(" " + i + "" + j + str);
			}
		}
		
	}
}


/*
°úÁ¦] 369°ÔÀÓÀ» ÇÏ¶ó.
¼ýÀÚ´Â 1ÀÌ»ó 99ÀÌÇÏ
10´ÜÀ§ ÁÙ¹Ù²ÞÀ»ÇÑ´Ù.
--

1 2 3Â¦ 4 5 6Â¦ 7 8 9Â¦ 10
11 12 ....             20
21
...
91Â¦ 92Â¦ 93Â¦Â¦ ....  99Â¦Â¦
*/