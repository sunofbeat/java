package ch05.ex05.case06;

public class Shooter {
	private Gun gun; //dependency
	
	public void fire() {
		gun.fire();
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}	
}
//A has a B   ( B�� dependency )