package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Friend {
	public void play() {
		Parent parent = new Parent();

		//다른패키지일 경우 접근가능 여부
//		parent.getRegNum();  //private
		parent.getName();     //public
//		parent.getMoney();   //protected
//		parent.addMoney();    //default
	}
}
