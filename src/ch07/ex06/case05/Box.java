package ch07.ex06.case05;

public class Box {
	//generic method
	public <T> T getLastVal(T[] arr) {
		return arr[arr.length -1];
	}
}
