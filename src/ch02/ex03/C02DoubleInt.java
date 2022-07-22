package ch02.ex03;

public class C02DoubleInt {

	public static void main(String[] args) {
		double d = 1.52;
		int i =(int)d;
		System.out.printf("%d, %.3f\n", i, d);

		double f = Math.floor(d);  //내림
		double r = Math.round(d);  //반올림
		double a = Math.ceil(d);   //올림
		
		System.out.printf("%f, %f, %f", f,r,a);


	}

}
