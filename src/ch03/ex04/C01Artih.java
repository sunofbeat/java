package ch03.ex04;

public class C01Artih {

	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
//		byte c = a + b; //리턴값의 형태는 int
//		int c = a + b;
		byte c = (byte)(a + b);
		System.out.println(c);
		
//		c = c + 1;
		c++;
		System.out.println(c);
		
		double d = (double)a / b;
		System.out.printf("%.1f\n",d);
		
		d = (double)a / b;   //(double)로 Casting을해 3.0나누기2.0으로 만들어줌
		System.out.println(d);
		
		d = 1.0 * a / b;
		System.out.println(d);
		
		d = (double)(a/b);  //()안에 있는 연산이 우선순위가 되어 int나누기int가 되기때문 1.0
		System.out.println(d);
		
		d = a / b * 1.0;
		System.out.println(d);
	}

}
