package ch07.ex06.case06;
						//A이하 타입 ,A를 부모로 갖고있는 클래스
public class Cabinet<T extends A> {
	//generic class에서 유한한 generic 메서드
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	}
}
