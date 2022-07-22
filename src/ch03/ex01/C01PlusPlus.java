package ch03.ex01;

public class C01PlusPlus {

	public static void main(String[] args) {
		//연산자가 앞에있던 뒤에있던 변화없음
		int i = 0;
		++i;	
		System.out.println(i);
		i++;
		System.out.println(i);
		
		
		//연산 순위
		i = 0;
		int j = ++i;
		System.out.println(i+", "+j);
		
		i = 0;
		j = i++;
		System.out.println(i +", "+j);

	}

}
