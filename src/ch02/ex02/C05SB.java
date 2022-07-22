package ch02.ex02;

public class C05SB {

	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 ");
		
		int len =src.length();
		System.out.println("lenght: " + len);
		
		src.append("짖는다."); //.append(붙이기)   .concat과 같지만 성능이좋음
		src.replace(3, 4, "고양이"); //substring과 같지만 성능이좋음 커서위치!! 0김1선2호3
		
		String str = src.toString();
		
		System.out.println(str);
		System.out.println(src); //우리 개는 짖는다.

	}

}
 