package encapspack;

class BankAccount{
	private double balance; // private: hidden from outside

	
	public void deposit(double amount){
		if(amount>0){
			balance+=amount;
		}
	}
	
	public void withdraw(double amount){
		double fee = 10; 
		if((amount + fee)<= balance){
			balance -=(amount+fee);
		}
	}
	
	public double getBalance(){
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

public class BankDetails {

	public static void main(String[] args) {

		BankAccount ac = new BankAccount();
		ac.deposit(1000);
		ac.setBalance(2000.0);
		
		
		System.out.println("Balance="+ ac.getBalance());
	}

}
