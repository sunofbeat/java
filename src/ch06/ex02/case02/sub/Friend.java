package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Friend {
	public void play() {
		Parent parent = new Parent();

		//�ٸ���Ű���� ��� ���ٰ��� ����
//		parent.getRegNum();  //private
		parent.getName();     //public
//		parent.getMoney();   //protected
//		parent.addMoney();    //default
	}
}
