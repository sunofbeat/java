package ch02.ex01;

public class C02Output {

	public static void main(String[] args) {
		int score = 100;
		        
		          //method //parameter
		System.out.println(score);  
		System.out.println(100 + 1); //expression ǥ��
		System.out.println(Math.random());      //method call -> return value
		
		//print
		System.out.print(200+" ");
		System.out.print(800);
		System.out.print("\n"); //tab "\t" space "\s"
		System.out.print(4444);
		System.out.printf("%b %c %d %f %s\n", true, 'a',10,1.15, "hello"); // printf�� parameter ù��°�� String��
		
		//����] �� ��¹����� �����ڷ� / �� ����ϼ���
		//printf
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a',10,1.15,"hello");
		System.out.printf("%5b|%5c|%5d|%5.3f|%5s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf("%5b|%5c|%5d|%.2f|%5s\n", true, 'a', 10, 1.15, "hello");
		
		String name = "�輱ȣ";
		int age = 32;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s��(��) %d�� �Դϴ�.", name, age); //printf ���� ���
		System.out.println();
		System.out.println(name + "��(��) " + age + "�� �Դϴ�."); //println�� ���� ���
		}

}
