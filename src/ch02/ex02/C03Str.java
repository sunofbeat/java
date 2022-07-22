package ch02.ex02;

public class C03Str {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.println("sum: " +sum);
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;
		System.out.println(sumStr);
		
		String s = a + b + ""; // (a+b)+""의 연산이돼고
		System.out.println(s); //3
		
		s= "" + a + b;         // (""+a)+b가 되므로 위치선택의 유의!!
		System.out.println(s);//12
		
		String dialog = "john said, \"hello\""; //문장안에 ""를 넣을때
		System.out.println(dialog);
	}

}
