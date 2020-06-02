#include <iostream>
#include <cstdio>
#include "BankAccount.h"

using namespace std;

BankAccount::BankAccount(string name, double balance)
{
	this->name = name;
	this->balance = balance;
}

string BankAccount::getName()
{
	return name;
}

double BankAccount::getBalance()
{
	return balance;
}

void BankAccount::deposit(double amount)
{
	balance = balance + amount;
}

void BankAccount::withdraw(double amount)
{
	balance = balance - amount;
}

void BankAccount::transfer(BankAccount *other, double amount)
{
	this->withdraw(amount);
	other->deposit(amount);
}

void BankAccount::toString()
{
	cout << "Name: " << name << ", Balance: $" << balance << endl;
}
