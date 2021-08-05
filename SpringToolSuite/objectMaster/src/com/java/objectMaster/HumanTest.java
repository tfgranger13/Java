package com.java.objectMaster;

public class HumanTest {

	public static void main(String[] args) {
		Human lord = new Human();
		Human peasant = new Human();
		lord.attack(peasant);
		System.out.println(lord.getHealth());
		System.out.println(peasant.getHealth());
		peasant.attack(lord);
		System.out.println(lord.getHealth());
		System.out.println(peasant.getHealth());
		lord.attack(peasant);
		System.out.println(lord.getHealth());
		System.out.println(peasant.getHealth());
		lord.attack(peasant);
		System.out.println(lord.getHealth());
		System.out.println(peasant.getHealth());
	}

}
