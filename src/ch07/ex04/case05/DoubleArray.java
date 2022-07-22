package ch07.ex04.case05;

public class DoubleArray {

	public static void main(String[] args) {
		//이중배열
		//표
		int[][] scores = {
			{90, 90, 90},
			{20, 20, 20},
			{30, 30, 30},
			{40, 40, 40},
			{50, 50, 50}
		};
		//합계점수나 평균점수는 유지보수를 위해 외부저장
		System.out.println("번호  국어  영어  수학  합계  평균");
		System.out.println("----------------------------");
		//i는 가로줄
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			System.out.print(" " + (i + 1) + " ");
			//j는 세로줄		//scores[0].lenght는 가로줄 3임
			for(int j = 0; j < scores[0].length; j++) {
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}
			System.out.printf("%5d %4d\n", sum, sum / scores[0].length);			
		}
	}
}
