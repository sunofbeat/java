package ch03.ex01;

public class C01PlusPlus {

	public static void main(String[] args) {
		//�����ڰ� �տ��ִ� �ڿ��ִ� ��ȭ����
		int i = 0;
		++i;	
		System.out.println(i);
		i++;
		System.out.println(i);
		
		
		//���� ����
		i = 0;
		int j = ++i;
		System.out.println(i+", "+j);
		
		i = 0;
		j = i++;
		System.out.println(i +", "+j);

	}

}
