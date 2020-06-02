/** 
	CheckingAccount is a subclass of BankAccount.
    A SavingsAccount has a name, balance, a 
    transaction fee, and a transaction counter.
 */
public class CheckingAccount extends BankAccount {

	static final double TRANSACTION_FEE = 3.0;
	static int transactionCount;


	/** 
	Construct a SavingsAccount.
	@param name the name of the account
	@param balance the initial balance in the account
 	 */
	public CheckingAccount(String name, double balance){
		super(name, balance);
		transactionCount = 0;
	}


	/** 
    Deposit money into this account and add 1 to the 
    transaction counter. 
    @param amount the amount to be deposited
     */
    @Override
	public void deposit(double amount){
		super.deposit(amount);
		transactionCount++;
	}


	/** 
    Withdraw money from this account and add 1 to the 
    transaction counter. 
    @param amount the amount to be withdrawn
     */
    @Override
	public void withdraw(double amount){
		super.withdraw(amount);
		transactionCount++;
	}


	/** 
    Withdraws total fees from the account based on the
    transaction fee and transaction count.
     */
	public void deductFees(){
		withdraw(transactionCount * TRANSACTION_FEE);
		transactionCount = 0;
	}

}