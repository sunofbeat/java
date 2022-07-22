package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
//		x = a.a; //private
		x = a.b;
		x = a.c;
		x = a.d;
		
//		a.m1(); //private
		a.m2(); 
		a.m3();
		a.m4();
	}
}
