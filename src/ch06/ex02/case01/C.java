package ch06.ex02.case01;

public class C extends A{
	public void test() {
		int x = 0;
		
//		x = this.a;  this���� ���ٺҰ�
		x = this.b;
		x = this.c;
		x = this.d;
		
//		this.m1();
		this.m2();
		this.m3();
		this.m4();
		
	}
}
