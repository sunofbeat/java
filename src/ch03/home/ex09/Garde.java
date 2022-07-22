package ch03.home.ex09;

import java.util.Scanner;

public class Garde {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: "); 
		int kor = sc.nextInt();
		System.out.print("����: "); 
		int eng = sc.nextInt();
		System.out.print("����: "); 
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = (double)total / 3;
		
		char score = avg >= 90 ? 'A' : (avg >= 80 ? 'B' : 'C');
				
		System.out.printf("\n���� :%d\n��� :%.1f\n���� :%c\n", total, avg, score);
	}
}
/* 
����, ����, ���� ������ �Է¹޴´�.
����, ���, ������ ����Ѵ�.
��������� �Ҽ������� 1�ڸ������� ����Ѵ�

90<= mean <= 100: A
80 <= mean < 90:B
      mean < 80:C
���� : 95
���� : 100
���� : 100

���� : 295
���: 98.3
����: A
*/
//if(100>= avg && avg >= 90) {
//char score = 'A';
//}else if(80<= avg && avg <90){
//char score = 'B';
//}else {
//char score = 'C';
//}
