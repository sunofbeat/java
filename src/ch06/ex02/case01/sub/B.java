package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A a = new A (); //import를 통해 A클래스를 가져옴
		
		int x = 0;
		//x = a.a;
		//x = a.b; //default는 같은패키지에서만 접근가능
	//	x = a.c; //protected도 같은패키지에서 접근가능
		x = a.d;  //public
		
		
		//a.m1(); //private
		//a.m2(); //default
		//a.m3(); //protected
		a.m4();   //public
	}
}
