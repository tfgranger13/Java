package com.java.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		Bat testBat = new Bat();
		testBat.attackTown();
		testBat.attackTown();
		testBat.attackTown();
		testBat.eatHumans();
		testBat.eatHumans();
		testBat.fly();
		testBat.fly();
		System.out.println(testBat.getEnergyLevel());
	}

}
