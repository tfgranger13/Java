//	package to import everything needed from within this project
package com.java.zookeeper;

//	initialize class
public class Bat extends Mammal {
	//	constructor with same name as the class
	public Bat () {
		this.setEnergyLevel(300);
	}
	public void fly() {
		System.out.println("WHOOSH");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	public void eatHumans() {
		System.out.println("sry bruh");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	public void attackTown() {
		System.out.println("bruh you on fire");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
}
