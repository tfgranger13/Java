package phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "iPhone " + this.getVersionNumber() + " says: Zing";
    }
    @Override
    public String unlock() {
    	return "Unlocking with facial recognition.";
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier());          
    }
}
