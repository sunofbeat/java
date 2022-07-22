package ch05.ex06.case01;

public class Main {

	public static void main(String[] args) {
		Man.say("I love java.");
		//Man.tell("");  //static이기에 불가
		
		Man man = new Man();
		man.tell("I Love JAVA.");
//		man.say("HELLO");  //say는 static변수인데 인스턴스변수로 착각될수 있음
	}
}
