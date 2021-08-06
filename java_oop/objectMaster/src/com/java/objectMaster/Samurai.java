package com.java.objectMaster;

public class Samurai extends Human{
	
	//	specific attributes
	private static int samuraiCount = 0;

	//	constructor
	public Samurai() {
		this.setHealth(200);
		samuraiCount ++;
	}
	
	public void deathblow(Human target) {
		target.setHealth(0);
		this.setHealth((int)Math.floor(this.getHealth()/2));
	}
	
	public void meditate() {
		this.setHealth((int)(Math.floor(this.getHealth()*1.5)));
	}
	
	public static int howMany() {
		return samuraiCount;
	}
	
}
