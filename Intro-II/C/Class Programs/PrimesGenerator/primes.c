#include <stdio.h>
#include <math.h>
#include "primes.h"

bool isPrime(int val)
{
	for(int divisor = 2; divisor <= sqrt(val); divisor++){
		if(val % divisor == 0){
			return false;
		}
	}
	return true;
}

void generatePrimes(int maxVal)
{
	for(int val; val <= maxVal; val++){
		if(isPrime(val)) {
			printf("%d ", val);
		}
	}
}

