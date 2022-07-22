package ch03.ex01;

public class C02MinusMinus {

	public static void main(String[] args) {
		int i = 0;
		--i;  //-1-i
		System.out.println(i);
		i--;  // i-1
		System.out.println(i);
		
		i = 0;
		int j = --i;
		System.out.println(i+","+j);
		
		i = 0;
		j = i--;
		System.out.println(i+","+j);
	}

}
