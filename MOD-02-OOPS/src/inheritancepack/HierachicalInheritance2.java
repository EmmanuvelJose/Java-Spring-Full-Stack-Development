package inheritancepack;

//Base class
class Account {
	String accountNumber;
	double balance;

	Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount + "  Balance:" + balance);
	}
}

// Derived class 1
class SavingAccount extends Account {
	double interestRate = 0.05;

	SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	void addInterest() {
		double interest = balance * interestRate;
		balance += interest;
		System.out.println("Interest added: " + interest + "  New Balance: " + balance);
	}
}

// Derived class 2
class CurrentAccount extends Account {
	double overdraftLimit = 5000;

	CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	void useOverdraft(double amount) {
		if (amount <= balance + overdraftLimit) {
			balance -= amount;
			System.out.println("Withdrew using overdraft. New Balance: " + balance);
		} else {
			System.out.println("Overdraft limit exceeded.");
		}
	}
}

// Derived class 3
class LoanAccount extends Account {
	double emi;

	LoanAccount(String accountNumber, double balance, double emi) {
		super(accountNumber, balance);
		this.emi = emi;
	}

	void payEMI() {
		balance -= emi;
		System.out.println("EMI of " + emi + " paid. Remaining loan: " + balance);
	}
}

// Main class
public class HierachicalInheritance2 {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount("SA123", 10000);
		sa.deposit(2000);
		sa.addInterest();

		CurrentAccount ca = new CurrentAccount("CA123", 5000);
		ca.useOverdraft(8000);

		LoanAccount la = new LoanAccount("LA123", 100000, 5000);
		la.payEMI();
	}

}
