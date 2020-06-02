#include <stdio.h>
#include <stdbool.h>

typedef struct financialIdentity_struct {

	double savings; // amount in savings
	double checkings; // amount to pay mortgage
	double loan; // from the house
	double debt; // from credit cards/student loans
	double debtPaid; // total amount a person paid to pay of $30,100 debt
	int yearsWithDebt; // years remained in debt
	int yearsRented; // years a person rented

} financialIdentity;

void savingsPlacement(financialIdentity* person, double interestRate);
void debt(financialIdentity* person, double interestRate, double addlPay);
void rent(financialIdentity* person, double rentAmt);
void house(financialIdentity* person, double housePrice, double interestRate, double mortgageTerm);
int* simulate(financialIdentity* person, double yearlySalary, bool financiallyLiterate);
void printWealth(financialIdentity* person, int* arr);
void outputWealth(financialIdentity* person, int*arr);
