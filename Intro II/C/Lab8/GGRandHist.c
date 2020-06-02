#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>

int ask_in_range(int min, int max);

int get_random(rangemin, rangemax)
{
	srand(time(0));
	return (rand() % (rangemax - rangemin + 1)) + rangemin;
}

int guessing_game(int num, int rangemin, int rangemax)
{
	printf("Hello and welcome to the game.\n");

	printf("Please enter your first name: ");
	char name[20]; // current player's name
	scanf("%s", name); 

	printf("You need to guess a number between %d and %d.\n", rangemin, rangemax);

	int count; // current player's score
	bool check = true; // true if incorrect, false if correct to break the loop
	int guess; // current user guess

	while(check){
		guess = ask_in_range(rangemin, rangemax);
		if(guess == num){
			count++;
			printf("Good job! You took %d guesses.\n", count);
			check = false;
		}
		else{
			if(guess > num){
				printf("Too high!\n");
				count++;
			}
			else{
				printf("Too low!\n");
				count++;
			}
		}
	}

	char prevName[20]; // previous player's name
	int prevScore; // previous player's score
	FILE* file = NULL;
	file = fopen("history.txt", "r"); // opens file for reading
	if(file == NULL){ // checks if file exists
		printf("Could not read from file!\n");
		fclose(file);
		return -1;
	}
	else{
		fscanf(file, "%s", prevName); // reads name from file
		fscanf(file, "%d", &prevScore); // reads score from file
		fclose(file); // closes file

		printf("The last person, %s, took %d guesses...\n", prevName, prevScore);

		file = fopen("history.txt", "w"); // opens file for writing
		fprintf(file, "%s\n%d", name, count);
		fclose(file);
	}

	return num;
}


int ask_in_range(int min, int max)
{
	int num;

	printf("Please enter a number: ");
	scanf("%d", &num);

	bool check = true;

	while(check){
		if(num < min || num > max){
			printf("Your number is outside of [%d, %d] range. ", min, max);

			printf("Please enter another number: ");
			scanf("%d", &num);
		}
		else {
			//printf("That number is within the [%d, %d] range. ", min, max);
			check = false;
		}
	}

	return num;
}

int main()
{
	int num = get_random(0,100);
	guessing_game(num, 0, 100);

	return 0;
}

/*
	Assuming the player guesses a new number each time, it would take them
	at most 1,001 guesses. This is because there are 500 total different
	numbers between 1 and 500, inclusive, and the same is with -1 to -500.
	The extra 1 guess is for the number 0.
*/





