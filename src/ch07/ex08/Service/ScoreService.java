package ch07.ex08.Service;

import java.util.List;

import ch07.ex08.domain.Score;

public interface ScoreService {
	void addScore(Score score);
	List<Score> getScores();
}
