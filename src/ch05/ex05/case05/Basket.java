package ch05.ex05.case05;

public class Basket {
	private Apple apple; //basket has an Apple
//¼Ó¼º, dependency¸¦ ¸â¹öº¯¼ö·Î µÐ´Ù
	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}
