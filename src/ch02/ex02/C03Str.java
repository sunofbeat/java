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
		
		String s = a + b + ""; // (a+b)+""�� �����̵Ű�
		System.out.println(s); //3
		
		s= "" + a + b;         // (""+a)+b�� �ǹǷ� ��ġ������ ����!!
		System.out.println(s);//12
		
		String dialog = "john said, \"hello\""; //����ȿ� ""�� ������
		System.out.println(dialog);
	}

}
