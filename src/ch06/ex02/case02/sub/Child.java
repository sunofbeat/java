package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent {
	public void play() {
//		this.getRegName(); //private
		this.getName();
		this.getMoney(); // 상속을 받았기때문에 protected도 접근가능
//		this.addMoney(1000); //default
	}
}
