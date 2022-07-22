package ch03.ex08;

public class Logical {

	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;  //true
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		
		b = (2 > 1) && (2 > 1); //true    비교(&& ||)와 논리(<, >, =)가 같이 있으면 비교가 먼저 실행됨
		b = 2 < 1 && 2 > 1;    //false
		b = 2 < 1 || 2 > 1;   //true  ||연산자는 하나만 true여도 true
		b = 2 < 1 || 2 < 1;  //false
		
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);   //b == false
		//&&연산과정에서 x값이 1이고 이미 false기 때문에 y값을 굳이 연산하지않음
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b", x, y, b); 
		// or|| 연산과정에서는 모든 결과를 봐야 해결

		
	}

}
