package ch04.home.ex05;

public class H01Gugudan {

	public static void main(String[] args) {
		int result = 0;
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				result = i * j;
				if(j == 1) System.out.println("");
				System.out.printf("%d x %d = %d\n", i, j, result);
			}
		}
	}
}

/*
 * 과제] 구구단을 출력하라
 * 
 * 2 * 1 = 2
 * 2 * 2 = 4
 * ...
 * 
 * 3 * 1 = 3
 * ...
 * 
 * 9 * 9 = 81
 * */
