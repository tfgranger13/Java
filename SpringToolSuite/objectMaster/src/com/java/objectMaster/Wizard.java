package com.java.objectMaster;

public class Wizard extends Human{
	
	//	constructor
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	//	additional methods
	public void heal(Human target) {
		target.setHealth(target.getHealth()+this.getIntelligence());
	}
	public void fireball(Human target) {
		target.setHealth(target.getHealth() - (3 * this.getIntelligence()));
	}
}
