package ch08.ex02.case05;

public class User {
	private String name;
	private Level level;
	
	public User(String name, Level level) {
		this.name = name;
		this.level = level;
	}
	
	public void upgradeLevel() {
		Level nextLevel = level.next();
		if(nextLevel == null) {
			throw new IllegalStateException(
					"�̹� �ְ� ��� " + this.level + "�Դϴ�.");
		}this.level = nextLevel;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s", name, level);
	}
}
