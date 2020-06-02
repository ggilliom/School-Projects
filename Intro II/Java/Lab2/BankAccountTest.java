/** 
	BankAccountTest is the main method. It does tests on
	the BankAccount, SavingsAccount, and CheckingAccount
	classes to ensure their correctness.
 */
public class BankAccountTest {
	public static void main(String[] args) {
	
		SavingsAccount savings = new SavingsAccount("Savings", 0.0, 5.0);
		CheckingAccount checking = new CheckingAccount("Checking", 500.0);

		savings.deposit(1000);
		checking.withdraw(100);
		savings.transfer(checking, 200);

		System.out.println(savings);
		System.out.println(checking);

		savings.addInterest();
		checking.deductFees();

		System.out.println(savings);
		System.out.println(checking);



	}
}