
public class Account {
private static int nextId = 1;

private int id;
private double balance;
private String description;

public int getId() {return id;}

public double getBalance() {return balance;}
private void setBalance(double newBalance) {balance = newBalance;}

public String getDescription() {return description;}

public Account(String newDescription) {
	this();
	this.description = newDescription;
	
}
private void checkAmountGtZero(double amount) throws Exception{
	if(amount <= 0) {
		throw new InsufficentFundsExe("Amount must be positive.");}
}
public void deposit(double amount) throws Exception{
checkAmountGtZero(amount);
setBalance(getBalance()+ amount);
	
}
public void withdraw(double amount) throws Exception {
checkAmountGtZero(amount);
if(getBalance() < 0 ) {
	throw new InsufficentFundsExe("Insufficient Funds");
}
setBalance(getBalance() - amount);
}

public Account() {
	id = nextId++;
	balance = 0;
	description = "New Account";
}
}
