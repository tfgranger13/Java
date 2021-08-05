package com.java.objectMaster;

public class Human {
	
	//	attributes come before constructor
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
		/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the stealth
	 */
	public int getStealth() {
		return stealth;
	}

	/**
	 * @param stealth the stealth to set
	 */
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	//	constructor after attributes and set/get
	public Human() {
	}
	
	//	then other methods
	public void attack(Human target) {
		target.setHealth(target.getHealth() - this.getStrength());
	}
}
