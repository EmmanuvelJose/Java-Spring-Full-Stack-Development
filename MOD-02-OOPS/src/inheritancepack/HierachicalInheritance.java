package inheritancepack;

//Base class
class Bank {
	int accountNumber = 3579;
}

class GoldLoan extends Bank {
	int goldaccountNumber = 56745;

	public void displayLoanDetails() {
		System.out.println("Account Number=" + accountNumber + "  Gold Account Number=" + goldaccountNumber);
	}
}

class VehicleLoan extends Bank {
	int vehicleaccountNumber = 14657;

	public void displayLoanDetails() {
		System.out.println("Account Number=" + accountNumber + "  Vehicle Account Number=" + vehicleaccountNumber);
	}
}

class HousingLoan extends Bank {
	int housingaccountNumber = 56764;

	public void displayLoanDetails() {
		System.out.println("Account Number=" + accountNumber + "  Housing Account Number=" + housingaccountNumber);
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {

		GoldLoan gl = new GoldLoan();
		gl.displayLoanDetails();

		VehicleLoan vl = new VehicleLoan();
		vl.displayLoanDetails();

		HousingLoan hl = new HousingLoan();
		hl.displayLoanDetails();

	}

}
