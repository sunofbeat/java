package ch02.ex02;

public class C05SB {

	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("�츮 ���� ");
		
		int len =src.length();
		System.out.println("lenght: " + len);
		
		src.append("¢�´�."); //.append(���̱�)   .concat�� ������ ����������
		src.replace(3, 4, "�����"); //substring�� ������ ���������� Ŀ����ġ!! 0��1��2ȣ3
		
		String str = src.toString();
		
		System.out.println(str);
		System.out.println(src); //�츮 ���� ¢�´�.

	}

}
 