package ch07.ex06.case06;
						//A���� Ÿ�� ,A�� �θ�� �����ִ� Ŭ����
public class Cabinet<T extends A> {
	//generic class���� ������ generic �޼���
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	}
}
