package ch03.home.ex09;

import java.util.Scanner;

public class Garde2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		char score = 0;
		
		System.out.print("����: ");  
		kor = sc.nextInt();
		System.out.print("����: "); 
		eng = sc.nextInt();
		System.out.print("����: ");  
		math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = (double)total / 3;
		score = (char)avg;
		
		if(avg >= 90) {
			score= 'A'; 
		}else if(avg >= 80){
			score= 'B'; 
		}else {
			score= 'C'; 
		}
		System.out.printf("���� :%d\n��� :%.1f\n���� :%c\n", total, avg, score);
	}
}


