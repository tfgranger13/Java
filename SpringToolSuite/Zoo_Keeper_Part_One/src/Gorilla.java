
public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("The gorilla has thrown something.");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	public void eatBananas() {
		System.out.println("The gorilla's hunger is now satiated.");
		this.setEnergyLevel(this.getEnergyLevel() +10);
	}
	public void climb() {
		System.out.println("The gorilla has climbed up a tree.");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
}
