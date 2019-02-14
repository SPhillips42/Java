
public class savings extends Account {

	private double intRate = 0.02;
	
	public double getIntRate() {
		return intRate;
	}
	public void payInterest() throws Exception {
		deposit(getBalance() * getIntRate());
	}
	
	private void setIntRate(double newIntRate) {
		intRate = newIntRate;
	}
	
	public savings(String newDescription, double newIntRate) {
		this(newDescription);
		setIntRate(newIntRate);
	}
	
	public savings(String newDescription) {
		super(newDescription);
	
	}

	public savings() {
	
	}

}
