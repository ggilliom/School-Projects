#ifndef CHECKINGACCOUNT_H
#define CHECKINGACCOUNT_H

#include <iostream>
#include "BankAccount.h"

using namespace std;

class CheckingAccount : public BankAccount {
private:
	int transactionCount;
	static const double TRANSACTION_FEE;

public:
	CheckingAccount(string name, double balance);
	void deductFees();
	void deposit(double amount);
	void withdraw(double amount);

};

#endif