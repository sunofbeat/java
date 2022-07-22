package ch07.ex05.case01;
//Generic Basket에 아무거나 담을때
public class Basket<E> {
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
