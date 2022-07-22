package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		Phone phone = new Phone();
		
		phone.setMakerName("삼성");
		phone.setPrice(1_000_000);
		
		person.setName("최한석");
		
		person.setPhone(phone);
		
		person.sendMsg();
		person.call();
		person.playGame();
	}
}
/*
 * 최한석은 삼성폰을 1백만원 주고 샀습니다.
 * 손에 든 폰을 보니 흐뭇합니다.
 * 
 * 메세지를 보내봅니다.
 * 답장이 없어, 전화를 걸어보니 , 연결이 안되네요.
 * 잠시뒤에 다시 연락해 볼겁니다.
 * 기다리는 동안 폰으로 게임을 합니다.
 */
//폰을 구매
//핸드폰안에 메세지 전화 게임