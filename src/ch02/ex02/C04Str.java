package ch02.ex02;

public class C04Str {

	public static void main(String[] args) {
		String src = "�츮 ���� ";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		char c = 0;
		
		int len = src.length();
		System.out.println("lenght: " + len);
		
		s1 = src.concat("¢�´�."); 
		s2 = src.replace("��", "�����"); //ù���� ���ڸ� �ι�°���ڷ� ����
		
		s3 = src.substring(0, 4); //������ �պκ� Ŀ������0 ex)0��1��2ȣ3
		c = src.charAt(3);  //���ڼ��� ��ġ�� ��Ÿ����
		
		String s4 = src.substring(3,4); //��
		
		
		
		System.out.printf("%s\n%s\n%s\n%c\n%s\n", s1,s2,s3,c,s4);
//		System.out.println(s4);
	}

}
