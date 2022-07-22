package ch02.ex02;

public class C04Str {

	public static void main(String[] args) {
		String src = "우리 개는 ";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		char c = 0;
		
		int len = src.length();
		System.out.println("lenght: " + len);
		
		s1 = src.concat("짖는다."); 
		s2 = src.replace("개", "고양이"); //첫번재 문자를 두번째문자로 변경
		
		s3 = src.substring(0, 4); //문자의 앞부분 커서부터0 ex)0김1선2호3
		c = src.charAt(3);  //글자수의 위치를 나타낼때
		
		String s4 = src.substring(3,4); //개
		
		
		
		System.out.printf("%s\n%s\n%s\n%c\n%s\n", s1,s2,s3,c,s4);
//		System.out.println(s4);
	}

}
