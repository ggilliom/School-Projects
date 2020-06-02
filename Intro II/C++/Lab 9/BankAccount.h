#ifndef BANKACCOUNT_H
#define BANKACCOUNT_H

#include <iostream>

using namespace std;

class BankAccount {
private:
	string name;

public:
	BankAccount(string name, double balance);
	string getName();
	double getBalance();
	virtual void deposit(double amount);
	virtual void withdraw(double amount);
	void transfer(BankAccount* other, double amount);
	void toString();

protected:
	double balance;

};

#endif