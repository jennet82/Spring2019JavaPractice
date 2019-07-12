package Day51;

public class BankAccount {
	
	String accountNumber;
	long accounNumber;
	double balance;
	
	public BankAccount(String accountNumber, long accounNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accounNumber = accounNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber="
	+ accountNumber + ", accounNumber=" 
				+ accounNumber + ", balance=" 
	+ balance
				+ "]";
	}

	public void deposit(int money) {
		this.balance = balance;
	}

	public void withdraw(int money) {
		this.balance = balance;
	}
	
	
	
	
	}
	
	


