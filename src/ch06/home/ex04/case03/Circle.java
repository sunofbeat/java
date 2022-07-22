package ch06.home.ex04.case03;

public class Circle{
	private Point point;
	private int r;
	
	public Circle(Point point, int r) {		
		this.r = r;
//		this.point = new Point(x, y); //이것도 가능
		this.point = point;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.point, this.r);
	}
}
