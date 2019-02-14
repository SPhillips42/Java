package banking;

public class Account {

	private static int nextId = 1;
	
	private int id;
	private double balance;
	private String description;
	
	// in C#: public int id { get; set; }
	public int getId() { return id; }
	// io C#: public double Balance { get; private set; }
	public double getBalance() { return balance; }
	private void setBalance(double newBalance) { balance = newBalance; }
	
	public String getDescription() { 
		return description; 
	}
	public void setDescription(String newDescription) { 
		description = newDescription; 
	}
	public boolean transferTo(Account account, double amount) throws DepositWithdrawTransferAmountNotPositiveException {
		try {
			withdraw(amount);
		} catch(InsufficientFundsException ex) {
			return false;
		}
		account.deposit(amount);
		return true;
	}
	private void checkAmountGtZero(double amount) throws DepositWithdrawTransferAmountNotPositiveException {
		if(amount <= 0) {
			throw new DepositWithdrawTransferAmountNotPositiveException("Amount must be positive.");
		}
	}
	public void deposit(double amount) throws DepositWithdrawTransferAmountNotPositiveException {
		checkAmountGtZero(amount);
		setBalance(getBalance() + amount);
	}
	public void withdraw(double amount) 
			throws DepositWithdrawTransferAmountNotPositiveException, InsufficientFundsException {
		checkAmountGtZero(amount);
		if(getBalance() < amount) {
			throw new InsufficientFundsException("Insufficient funds.");
		}
		setBalance(getBalance() - amount);
	}
	
	// in C#: public Account(string NewDescription) : this()
	public Account(String newDescription) {
		this();
		description = newDescription;
	}

	public Account() {
		id = nextId++;
		balance = 0;
		description = "*New Account*";
	}
}
