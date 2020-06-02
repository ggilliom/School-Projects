#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>

int ask_in_range(int min, int max);

int guessing_game(int num, int rangemin, int rangemax)
{
	printf("Hello and welcome to the game.\n");
	printf("You need to guess a number between %d and %d.\n", rangemin, rangemax);

	int count; // guess counter; only counts if guess is within the range
	bool check = true; // true if incorrect, false if correct to break the loop
	int guess; // current user guess

	while(check){
		guess = ask_in_range(rangemin, rangemax);
		if(guess == num){
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
	return num;
}


int ask_in_range(int min, int max)
{
	int num;

	printf("Please enter a number: ");
	scanf("%d", &num);

	bool check = true;

	while(check){
		if(num < min || num > max){  // does not affect counter
			printf("Your number is outside of [%d, %d] range. ", min, max);

			printf("Please enter another number: ");
			scanf("%d", &num);
		}
		else {
			check = false;
		}
	}

	return num;
}

int main()
{
	guessing_game(37, 0, 100);


	return 0;
}





