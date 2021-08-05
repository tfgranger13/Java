
public class Mammal {
	private int energyLevel = 100;
	
	/**
	 * @return the energyLevel
	 */
	public int getEnergyLevel() {
		return energyLevel;
	}
	/**
	 * @param energyLevel the energyLevel to set
	 */
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("Energy level is: " + energyLevel);
		return energyLevel;
	}
}

