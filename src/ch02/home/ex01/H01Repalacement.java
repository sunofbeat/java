package ch02.home.ex01;

public class H01Repalacement {

	public static void main(String[] args) {
	// 두 변수의 데이터를 교체하라
		int i = 1;
		int j = 2;
		
		int k = 0;
		k = i;
		i = j;
		j = k;
		
System.out.println(i+","+j);
	}

}
