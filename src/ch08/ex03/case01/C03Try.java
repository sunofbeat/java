package ch08.ex03.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			
			for(int i: arr) out.println("arr[" + i + "]: " + arr[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			out.println("�迭 ���ܰ� �߻��߽��ϴ�.");
		}catch(IOException e) {
			System.out.println("IO ���� �߻��߽��ϴ�.");
		} finally {
			if(out != null) out.close();
		}
		
		System.out.println("��.");
	}
}
