package ch07.ex04.case05.presentation;

import ch05.ex06.case02.Console;
import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo{
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {

		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		
		for(int i = 0; i < 5; i++) {
			korScore = Console.inNum("국어점수.");
			engScore = Console.inNum("영어점수.");
			mathScore = Console.inNum("수학점수.");
			
			scoreService.addScore(new Score(korScore, engScore, mathScore));
		}
		Score[] scores = scoreService.getScores();
		
		for(Score score: scores)
			System.out.println(score);
	}	
}