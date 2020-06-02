#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[])
{
	// Reading input
	// scanf, fscanf, sscanf
	// stdin, file,   strings

	/*
	// using scanf to read from stdin
	int userVal;
	printf("Enter a number: ");
	// MUST pass in the MEMORY ADDRESS of the variable to store the input
	scanf("%d", &userVal);
	printf("You entered %d. \n", userVal);
	// a pointer already because all arrays are pointers to the beginning of that array

	char name[20];
	// *(name+1)
	int age;
	printf("Enter your name and age: ");
	scanf("%s %d", name, &age);
	printf("Hello %d year old %s.\n", age, name);
	*/

	// Using fscanf to read from a file
	FILE* file = NULL;
	file = fopen("in.txt", "r");
	if(file == NULL){
		printf("Could not read from file!\n");
		return -1;
	}

	int numLines;
	fscanf(file, "%d", &numLines);
	printf("There are %d lines.\n", numLines);
	int* vals = (int*)malloc(numLines * sizeof(int)); // dynamically allocate space to read file

	for(int spot = 0; spot < numLines; spot++){
		fscanf(file, "%d", (vals + spot)); // when adding spot, it changes what vals points to
	}

	for(int spot = 0; spot < numLines; spot++){
		printf("%d\n", vals[spot]);
	}

	fclose(file);
	free(vals);

	return 0;
}