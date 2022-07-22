package ch07.ex08;

import java.util.ArrayList;
import java.util.List;

import ch07.ex08.Presentation.ScoreIo;
import ch07.ex08.Service.ScoreService;
import ch07.ex08.Service.ScoreServiceImpl;
import ch07.ex08.dao.ScoreDao;
import ch07.ex08.dao.ScoreDaoImpl;
import ch07.ex08.domain.Score;

public class Main {
	public static void main(String[] args) {
		List<Score> scores = new ArrayList<>();
		
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo =new ScoreIo(scoreService);
		
		scoreIo.play();
	}
}
