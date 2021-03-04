#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <unistd.h>
#include <string.h> 


char* decToBin(unsigned int n)
{
	unsigned int num = n;

	int count = 0;

	char* binary = "";
	char* zero = "0";
	char* one = "1";

	char* space;
	space = malloc(strlen(binary)+2);

	for(int count = 0; count <= 31; count++){
		space = malloc(strlen(binary)+2);

		if(num % 2 == 0){
			strcpy(space, zero);
		}
		else{
			strcpy(space, one);
		}

		strcat(space, binary);
		binary = space;
		num = num >> 1;
	}

	free(space);

	return binary;
}

unsigned int prefix(unsigned int n, unsigned int x) 
{
	int shift = 32 - n;
	unsigned int fin = x >> shift;

	return fin;
}


unsigned int suffix(unsigned int n, unsigned int x)
{
	int ones = (1 << n) - 1; 

	unsigned int fin = x & ones;

	return fin;
}

unsigned int toggle(unsigned int n, unsigned int x)
{
	unsigned int isolate = suffix(1, x >> n);
	unsigned int flipped = ~isolate & 1;
	unsigned int slotted = flipped << n;

	unsigned int pre = prefix(31 - n, x);
	unsigned int suff = suffix(n, x);
	unsigned int prefixShift = pre << (n + 1);

	unsigned int fin = prefixShift | slotted | suff;

	return fin;
}

int main()
{
	unsigned int num;
	printf("Please enter a 32-bit number in decimal format:\n");
	scanf("%u", &num);
	printf("number: %u\n", num);

	unsigned int n;
	printf("Please enter a number less than 32:\n");
	scanf("%u", &n);
	printf("n: %u\n", n);

	unsigned int pre = prefix(n, num);
	unsigned int suff = suffix(n, num);
	unsigned int toggled = toggle(n, num);

	char* numBin = malloc(sizeof(char) * 32);
	char* preBin = malloc(sizeof(char) * 32);
	char* suffBin = malloc(sizeof(char) * 32);
	char* toggBin = malloc(sizeof(char) * 32);

	printf("Original num in decimal: %u\n", num);
	printf("Original number in binary: %s\n", decToBin(num));

	printf("Prefix of %u bits in decimal: %u\n", n, pre);
	printf("Prefix of %u bits in binary: %s\n", n, decToBin(pre));

	printf("Suffix of %u bits in decimal: %u\n", n, suff);
	printf("Suffix of %u bits in binary: %s\n", n, decToBin(suff));

	printf("Toggled index %u in decimal: %u\n", n, toggled);
	printf("Toggled index %u in binary: %s\n", n, decToBin(toggled));

	return 0;
}
