#include <iostream>
#include <cstdio>
#include "CheckingAccount.h"

using namespace std;

CheckingAccount::CheckingAccount(string name, double balance) : BankAccount(name, balance)
{
	transactionCount = 0;
}

const double CheckingAccount::TRANSACTION_FEE = 3.0;

void CheckingAccount::deposit(double amount)
{
	balance = balance + amount;
	transactionCount++;
}

void CheckingAccount::withdraw(double amount)
{
	balance = balance - amount;
	transactionCount++;
}

void CheckingAccount::deductFees()
{
	this->withdraw(transactionCount * TRANSACTION_FEE);
	transactionCount = 0;
}