/** 
	BankAccount is the top of the Account hierarchy.
	Subclasses SavingsAccount and CheckingAccount 
	extend it. A BankAccount has a name and a balance.
 */
public class BankAccount{
	
	private String name;
	private double balance;


	/** 
	Construct a BankAccount.
	@param name the name of the account
	@param balance the initial balance in the account
 	 */
	public BankAccount(String name, double balance){
		this.name = name;
		this.balance = balance;
	}


    /** 
    Return the name of this account.
    @return the name of this account
     */
	public String getName(){
		return name;
	}


    /** 
    Return the balance of this account.
    @return the balance of this account
     */
	public double getBalance(){
		return balance;
	}


    /** 
    Deposit money into this account.
    @param amount the amount to be deposited
     */
	public void deposit(double amount){
		balance = balance + amount;
	}


    /** 
    Withdraw money from this account.
    @param amount the amount to be withdrawn
     */
	public void withdraw(double amount){
		balance = balance - amount;
	}


    /** 
    Transfer money from this account into another account.
    @param other the account which will recieve the money
    @param amount the amount to be transferred
     */
	public void transfer(BankAccount other, double amount){
		this.withdraw(amount);
		other.deposit(amount);
	}


    /** 
    Return a string stating the name and balance of the account.
    @return a String stating the name and balance of the account
     */
    @Override
	public String toString(){
		return "Name: " + name + ": Balance: " + balance;
	}

}