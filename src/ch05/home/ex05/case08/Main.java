package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Ball ball = new Ball();
		
		player1.setName("한석이");
		player2.setName("아름이");
		player3.setName("승일이");
		
		player3.kick(player2.pass(player1.pass(ball)));
	}
}
