/** 
	SavingsAccount is a subclass of BankAccount.
    A SavingsAccount has a name, balance, and interest rate.
 */
public class SavingsAccount extends BankAccount{

	private double interestRate;


	/** 
	Construct a SavingsAccount.
	@param name the name of the account
	@param balance the initial balance in the account
	@param interest the interest rate of the account
 	 */
	public SavingsAccount(String name, double balance, double interest){
		super(name, balance);
		interestRate = interest;
	}


	/** 
	Deposit interest into the account.
 	 */
	public void addInterest(){
		deposit(getBalance() * (interestRate / 100));
	}

}