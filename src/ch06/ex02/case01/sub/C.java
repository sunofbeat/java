package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C  extends A{
	public void test() {
		int x = 0;
		
//		x = this.a;   //private
//		x = this.b;    // default
		x = this.c;    //protected �ٸ���Ű���� �ִ���� ����̸� ���ٰ����ϴ�
		x = this.d;  //public
		
//		this.m1(); //private
//		this.m2(); //default
		this.m3();
		this.m4();
		
	}
}
