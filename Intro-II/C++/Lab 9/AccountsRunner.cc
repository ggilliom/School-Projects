#include <iostream>
#include "BankAccount.h"
#include "CheckingAccount.h"
#include "SavingsAccount.h"

using namespace std;


int main()
{
	BankAccount* starter = new BankAccount("starter", 0);
	BankAccount* advanced = new BankAccount("advanced", 500);

	starter->deposit(1000);
	advanced->withdraw(100);
	starter->transfer(advanced, 200);

	starter->toString();
	advanced->toString();

	SavingsAccount* savings = new SavingsAccount("Fido", 0.0, 1.0);
	CheckingAccount* checking = new CheckingAccount("Garrett", 500.0);

	savings->deposit(1000);
	checking->withdraw(100);
	savings->transfer(checking, 200);

	savings->toString();
	checking->toString();

	savings->addInterest();
	checking->deductFees();

	savings->toString();
	checking->toString();

	return 0;
}