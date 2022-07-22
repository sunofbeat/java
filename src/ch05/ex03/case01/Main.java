package ch05.ex03.case01;

public class Main {

	public static void main(String[] args) {
		Tv myTv = new Tv();
		
		System.out.println(myTv);
		
		//객체가 생성됐을때 데이터가 초기화됨
		System.out.printf("%s, %b, %d\n",
				myTv.getColorl(), myTv.isPower(), myTv.getChannel());
		
		myTv.setColorl("red");
		myTv.setPower(true);
		myTv.setChannel(7);
		
		System.out.printf("%s, %b, %d\n",
				myTv.getColorl(), myTv.isPower(), myTv.getChannel());
	}
}
