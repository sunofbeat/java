package ch07.home.ex05.case10;

public class Main {
	public static void main(String[] args) {
	Pencil pencil = new Pencil();
	Eraser eraser = new Eraser();
	Bag<Stationery> bag = new Bag<>();
	
	bag.add(pencil);
	bag.add(eraser);
	
	for(Stationery stationery: bag) {
			
		if(stationery instanceof Pencil) ((Pencil)stationery).write();
		if(stationery instanceof Eraser) ((Eraser)stationery).erase();
		}
	}
}
/*
���濡 ���ʰ� ���찳�� ��´�.
���濡�� ������ ������.
���� ������ �����̸� write, ���찳�� �����.

*/