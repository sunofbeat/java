package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i =1;
		double d =0.0;
		
		d = i; //Promotion
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i; //Casting
		System.out.printf("%f, %d\n", d, i);
		
		//i = d;  ºÒ°¡
		i = (int)d; //Casting
		System.out.printf("%f, %d\n", d, i);
	}
}
