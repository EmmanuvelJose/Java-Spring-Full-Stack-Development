//Customer Billing System with Two Products and their total

package oopsbasic2;

//class
class Customer{
    int customerId;
    String customerName;
    int productOnePrice;
    int productTwoPrice;

    //Constructor
    Customer(int id, String name,int pOne,int pTwo){
        customerId = id;
        customerName = name;
        productOnePrice = pOne;
        productTwoPrice = pTwo;
        
    }

    // Method to print customer details
    public void printDetails() {
    	/*
        System.out.println("Customer ID: " + customerId +
                " \tCustomer Name: " + customerName +
                " \tProduct One Price:" + productOnePrice +
                " \tProduct Two Price:" + productTwoPrice +
                " \tTotal Price:" + (productOnePrice+productTwoPrice));
        */
    	System.out.println("Customer ID: " + customerId +
                " \tCustomer Name: " + customerName +
                " \tProduct One Price:" + productOnePrice +
                " \tProduct Two Price:" + productTwoPrice +
                " \tTotal Price:" + total());
    }
    
    
    //total method
    public int total(){
    	return productOnePrice+productTwoPrice;
    }
    
}

//main class
public class CustomerDetails2 {
	public static void main(String[] args){
		Customer CustomerOne = new Customer(1,"Dona",300,700);
		CustomerOne.printDetails();
		Customer CustomerTwo = new Customer(2,"Sona",200,800);
		CustomerTwo.printDetails();
		
		
	}

}
