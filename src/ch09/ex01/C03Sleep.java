package ch09.ex01;

public class C03Sleep {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
