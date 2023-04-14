package sg3;

public class Account {
	String accountType;
	double balance;
    Customer customer;
	public Account(Customer customer,String accountType) {
		super();
		this.accountType=accountType;
		this.customer=customer;
	}

	public void setBalance(double balance) {
		balance=1000;
	}
	public double getBalance() {
		return balance;
		
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Transaction Successfull");
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
		}
	}
	public void display() {
		System.out.println("customer setails "+customer.getFirstName() + customer.getLastName());
		
	}
	
}