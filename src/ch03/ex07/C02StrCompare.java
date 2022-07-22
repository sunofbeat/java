package ch03.ex07;

public class C02StrCompare {

	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a";
		b = s == "a";  //true
		
		s = new String("a"); 
		b = s == "a";  //false
		
		b = s.equals("a"); //true
		
		
		System.out.println(b);

	}

}
