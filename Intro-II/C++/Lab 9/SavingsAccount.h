#ifndef SAVINGSACCOUNT_H
#define SAVINGSACCOUNT_H

#include <iostream>
#include "BankAccount.h"

using namespace std;

class SavingsAccount : public BankAccount {
private:
	double interest;

public:
	SavingsAccount(string name, double balance, double interest);
	void addInterest();

};

#endif