package ch07.ex01.case09;

public class Shooter {
	//dependency type�� interface�� �д�(Ȯ�强)
	private Gun gun; 
	
	public void fire() {
		this.gun.fire();
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
