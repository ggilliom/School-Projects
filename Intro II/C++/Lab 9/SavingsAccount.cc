#include <iostream>
#include <cstdio>
#include "SavingsAccount.h"

using namespace std;

SavingsAccount::SavingsAccount(string name, double balance, double interest) : BankAccount(name, balance)
{
	this->interest = interest;
}

void SavingsAccount::addInterest()
{
	this->deposit((interest / 100.0) * this->getBalance());
}
