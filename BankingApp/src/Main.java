
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		savings acct = new savings("My first account");
		try {
			acct.deposit(1000);
			acct.withdraw(200);
			acct.payInterest();
			System.out.println("Balance is " + acct.getBalance());
		} catch(Exception ex) {
			
		}
	}

}
