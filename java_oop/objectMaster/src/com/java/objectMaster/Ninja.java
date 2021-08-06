package com.java.objectMaster;

public class Ninja extends Human{

//	constructor
	public Ninja() {
		this.setStealth(10);
	}
	
	//	additional methods
	public void steal(Human target) {
		target.setHealth(target.getHealth() - this.getStealth());
		this.setHealth(this.getHealth()+this.getStealth());
	}
	public void flee() {
		this.setHealth(this.getHealth() - 10);
	}
}
