package ch08.ex02.case02;

public class Main {

	public static void main(String[] args) {
		Way way = Way.LEFT;
		String direction = "";
		
		switch(way) {
		case LEFT: direction = "����"; break;
		case RIGHT: direction = "������";
		}
		
		System.out.println(direction);
	}
}
