package ch03.home.ex09;

import java.util.Scanner;

public class Garde {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: "); 
		int kor = sc.nextInt();
		System.out.print("영어: "); 
		int eng = sc.nextInt();
		System.out.print("수학: "); 
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = (double)total / 3;
		
		char score = avg >= 90 ? 'A' : (avg >= 80 ? 'B' : 'C');
				
		System.out.printf("\n총점 :%d\n평균 :%.1f\n학점 :%c\n", total, avg, score);
	}
}
/* 
국어, 영어, 수학 점수를 입력받는다.
총점, 평균, 학점을 출력한다.
평균점수는 소수점이하 1자리까지만 출력한다

90<= mean <= 100: A
80 <= mean < 90:B
      mean < 80:C
국어 : 95
영어 : 100
수학 : 100

총점 : 295
평균: 98.3
학점: A
*/
//if(100>= avg && avg >= 90) {
//char score = 'A';
//}else if(80<= avg && avg <90){
//char score = 'B';
//}else {
//char score = 'C';
//}
