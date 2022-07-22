package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static {//딱 한번만 알리고 싶은내용은 static블럭에 넣으면된다
		Init.s = 0;
//		this.i = 1;//this라는 변수가 없기때문.
		System.out.println("static{}");
	}
	
	//인스턴스가 생성될때
	{
		Init.s = 1;
		this.i = 1;
		System.out.println("{}");
	}
	
	public Init() {
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	}
	
	public Init(int i) {
		Init.s = i;
		this.i = i;
		System.out.println("Init(int)");
	}

}
