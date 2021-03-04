#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <string.h>
#include "FinLit.h"

typedef struct financialIdentity_struct financialIdentity;

void savingsPlacement(financialIdentity* person, double interestRate)
{
	person->savings = person->savings + (person->savings * (interestRate / 100));
}

void debt(financialIdentity* person, double interestRate, double addlPay)
{

	double amount = 0;
	double leftovers;
	bool inDebt;
	if(person->debt > 0){
		inDebt = true;
	}
	else{
		inDebt = false;
	}


	if(inDebt){ // for loop doesn't run if not in debt during beginning of year
		for(int month = 1; month <= 12; month++){
			if(inDebt){ // calculations stop if debt is paid off mid-year
				amount = (person->debt * .03) + addlPay;
				if(amount >= person->debt){
					if(person->checkings < person->debt){ // checkings is less than debt
						leftovers = person->debt - person->checkings;
						person->checkings = 0;
						person->savings -= leftovers;
					}
					else{ // checkings is greater than debt
						person->checkings -= person->debt;
					}
					person->debtPaid += person->debt;
					person->debt = 0;
				}
				else{ // amount < debt
					if(person->checkings < amount){
						leftovers = amount - person->checkings;
						person->checkings = 0;
						person->savings -= leftovers;
					}
					else{ // checking is enough to pay amount
						person->checkings -= amount;
					}
					person->debt -= amount;
					person->debtPaid += amount;
				}
				if(person->debt <= 0){
					inDebt = false;
				}
			} // end of inner inDebt if
			//printf("person debt: %f\n", person->debt); // DELETE
		}// end of for loop
		person->debt *= 1 + (interestRate / 100);
		person->yearsWithDebt++; // increment if debt was paid during the year
		printf("\nyear break\n");
	} // end of outer inDebt if
}

void rent(financialIdentity* person, double rentAmt)
{
	double tempRent;
	for(int month = 1; month <= 12; month++){
		tempRent = rentAmt;
		if(person->checkings < rentAmt){
			tempRent -= person->checkings;
			person->checkings = 0;
			person->savings -= tempRent;
		} 
		else{
			person->checkings -= rentAmt;
		}
	}
	person->yearsRented++;
}

void house(financialIdentity* person, double housePrice, double interestRate, double mortgageTerm)
{
	int numPayments = mortgageTerm * 12; // 30 years * 12 monthly payments
	double interest = (interestRate / 100) / 12; // interest rate per month
	double discountFactor = (pow(1 + interest, numPayments) - 1) / (interest * pow(1 + interest, numPayments));
	double monthlyPayment = housePrice / discountFactor;
	double leftovers = 0;
	bool hasLoan = true;

	printf("monthly payment: %f\n", monthlyPayment);


	for(int year = 1; year <= 12; year++){
		if(hasLoan){
			if(monthlyPayment >= person->loan){ //monthly payment >= loan, use loan
				if(person->checkings < person->loan){//checkings < loan
					leftovers = person->loan - person->checkings;
					person->checkings = 0;
					person->savings -= leftovers;
				}
				else{ // enough in checkings for loan
					person->checkings -= person->loan;
				}
				person->loan = 0;

			}
			else{ // monthly payment < loan, use monthly payment
				if(person->checkings < monthlyPayment){
					leftovers = monthlyPayment - person->checkings;
					person->checkings = 0;
					person->savings -= leftovers;
				}
				else{
					person->checkings -= monthlyPayment;
				}
				person->loan -= monthlyPayment;
			}

			if(person->loan <= 0){
				hasLoan = false;
			}
		} // end of hasLoan if
	} // end of for loop

	person->loan += person->loan * (interestRate / 100); // add back yearly interest
}



int* simulate(financialIdentity* person, double yearlySalary, bool financiallyLiterate)
{

	int* arr = (int*)malloc(41 * sizeof(int));
	arr[0] = -25100;

	int wealth;

 	// initialize struct members
	person->debtPaid = 0;
	person->yearsWithDebt = 0;
	person->loan = 0;
	person->yearsRented = 0;

	// input variables
	double debtInterest;
	double rentAmt;
	double mortgageTerm;
	double houseCost;
	double loanInterest;

	// fl/nfl variables
	double savingsInterest;
	double housePrice;
	double addlPay;
	double downPayment;
	bool hasHouse;
	

	// question variables
	char simAnswer[6];
	char fiChoice[6];

	printf("Would you like to do a standard simulation? (enter \"yes\" or \"no\")\n");
	scanf("%s", simAnswer);

	printf("Is the person Financially Literate or not? (enter \"fl\" or \"nfl\")\n");
	scanf("%s", fiChoice);

	// determines financial literacy
	if(strcmp(fiChoice, "fl") == 0){
		financiallyLiterate = true;
	}
	if(strcmp(fiChoice, "nfl") == 0){
		financiallyLiterate = false;
	}


	if(strcmp(simAnswer, "yes") == 0){ // assigns default values
		person->savings = 5000;
		person->checkings = 0;
		person->debt = 30100;

		hasHouse = false;
		debtInterest = 20;
		rentAmt = 850;
		mortgageTerm = 30;
		houseCost = 175000;
		yearlySalary = 59000;


		if(financiallyLiterate){
			savingsInterest = 7;
			addlPay = 15;
			downPayment = houseCost * .2;
			housePrice = houseCost - downPayment;
			loanInterest = 4.5;
		}
		else{
			savingsInterest = 1;
			addlPay = 1;
			downPayment = houseCost * .05;
			housePrice = houseCost - downPayment;
			loanInterest = 4.5 + .5;
		}
	}

	if(strcmp(simAnswer, "no") == 0){ // assigns input values from file
		char filename[20];
		char temp[20];
		printf("What is the full name of the input file?\n");
		scanf("%s", filename);
		FILE* input = NULL;
		input = fopen(filename, "r");
		while(input == NULL){
			printf("Please enter another file name:\n");
			scanf("%s", filename);
			input = fopen(filename, "r");
		}

		fscanf(input, "%s %lf", temp, &(person->savings)); // savings
		fscanf(input, "%s %lf", temp, &(person->checkings)); // checkings
		fscanf(input, "%s %lf", temp, &(person->debt)); // debt
		fscanf(input, "%s %lf", temp, &yearlySalary); // yearly salary
		fscanf(input, "%s %lf", temp, &loanInterest); // mortgage interest, +.5 if nfl
		fscanf(input, "%s %lf", temp, &houseCost); // initial house cost
		fscanf(input, "%s %lf", temp, &debtInterest); // debt interest
		fscanf(input, "%s %lf", temp, &rentAmt); // monthly mortgage payment
		fscanf(input, "%s %lf", temp, &mortgageTerm); // length of mortgage, years
		
		if(financiallyLiterate){
			savingsInterest = 7;
			addlPay = 15;
			downPayment = houseCost * .2;
			housePrice = houseCost - downPayment;
		}
		else{
			savingsInterest = 1;
			addlPay = 1;
			downPayment = houseCost * .05;
			housePrice = houseCost - downPayment;
			loanInterest += .5;
		}
	}
	
	// simulation (40 years)
	for(int year = 1; year <= 40; year++){
		person->savings += yearlySalary * .2;
		person->checkings += yearlySalary * .3;
		savingsPlacement(person, savingsInterest);
		debt(person, debtInterest, addlPay);

		if(person->savings < downPayment && (!hasHouse)){ // rent
			rent(person, rentAmt);
		}
		else{
			if(!hasHouse){ // buy house
				person->loan = housePrice;
				person->savings -= downPayment;
				hasHouse = true;
			}
			else{
				if(person->loan > 0){ // calls house() method
					house(person, housePrice, loanInterest, mortgageTerm);
				}
			}
		}
		// adds year's wealth to array
		arr[year] = (int)(person->checkings + person->savings - person->debt - person->loan);
	}

	return arr;

}

void printWealth(financialIdentity* person, int* arr)
{
	for(int spot = 0; spot < 41; spot++){
		printf("year %d: %d\n", spot, arr[spot]);
	}
	printf("Years rented: %d\n", person->yearsRented);
}

// method to write array to file
void outputWealth(financialIdentity* person, int* arr)
{
	char filename[20];
	char temp[20];
	printf("What is the full name of the output file?\n");
	scanf("%s", filename);
	FILE* output = NULL;
	output = fopen(filename, "w");
	for(int spot = 0; spot < 41; spot++){
		fprintf(output, "%d\n", arr[spot]);
	}
}

int main()
{
	printf("\n");

	int numPeople;
	double yearlySalary;
	bool financiallyLiterate;
	printf("Welcome to the financial simulation! How many people will we simulate?\n");
	scanf("%d", &numPeople); // takes in number of people to simulate

	for(int spot = 1; spot <= numPeople; spot++){
		financialIdentity* person = (financialIdentity*)malloc(sizeof(financialIdentity)); // allocates memory for typedef struct
		int* flArr = simulate(person, yearlySalary, financiallyLiterate); // runs simulation
		outputWealth(person, flArr);
		free(person); // frees typedef struct memory
		printf("Person %d done!\n", spot);
	}

	printf("\n");

	return 0;
}
