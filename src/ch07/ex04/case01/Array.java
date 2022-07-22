package ch07.ex04.case01;

public class Array {
	public static void main(String[] args) {
		//String타입을 n개받을수있는 객체
		//일반객체는 데이터타입, 변수명이 제각각이지만
		//배열객체를 생성하면 멤버변수선언을 자동생성된다. 데이터타입이 동일하다
		String[] strs = new String[3];
		System.out.println(strs);
		
		//Integer = weapper class
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
		
		System.out.printf("%d, %d, %d\n", ints[0], ints[1], ints[2]);
		System.out.printf("%d, %d, %d\n", integers[0], integers[1], integers[2]);
		System.out.printf("%d, %d, %d\n", strs[0], strs[1], strs[2]);

		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);

		for(int i = 0; i < ints.length; i++) ints[i] = i;
		
		for(int i = 0; i < ints.length; i++)
			System.out.print(ints[i] + " ");
		
		System.out.println("\n");
		
		//collection
		//for each문
		//for(원소를 담을 데이터: 콜렉션)
		for(int i: ints) System.out.print(i + " ");
		
		// 순차적으로 읽어내는 작업 iterating(쇼핑몰등에서 가격(낮은가격부터, 높은가격부터), 인기도순 등) 
		
		//이렇게 쓰는경우는 드물다
//		int[] array = {0, 1, 2};
//		array = new int[] {0, 1, 2};
//		
		
	}
}