package ch04.ex02;

public class C01Switch {

	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		switch(grade) {
		case 3: coupon += "10,000원 ";
		case 2: coupon += "5,000원 ";
		case 1: coupon += "1,000원 ";
		case 0: coupon += "100원 ";
		break;
		//default : 조건식의 결과와 일치하는 case문이 없을때 수행될 문장들
		default : coupon += "상금없음"; 
		}
		System.out.println(coupon);
	}
}
