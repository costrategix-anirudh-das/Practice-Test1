package section_6;

public class Accounts {
	
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public Accounts( ) {
		this("Default_Number", 100d, "Default_Name", "Default_Email", "Default_Phone");
	}
	
	public Accounts(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
		this.balance = balance;
		this.customerEmailAddress = customerEmailAddress;
		this.number = number;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	
	public void deposit(double depositAmount) {
		
		this.balance += depositAmount;
	}
	
	public void withdrawal(double withdrawalAmount) {
		
		if (this.balance - withdrawalAmount < 0) {
			System.out.println("Insufficient funds");
		}
		else {
			this.balance -= withdrawalAmount;
			System.out.println("Successful");
			System.out.println("Remaining Balance = " + this.balance);
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	

}
