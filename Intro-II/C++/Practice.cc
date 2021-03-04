#include <iostream>
using namespace std;

void foo(int** arr)
{
	*arr = (int*)malloc(10*sizeof(int));
	(*arr)[5] = 42;
}

int main()
{
	int q = 500;
	int* p;
	p = &q;
	q = 1432;
	cout << *p << endl; // prints 1432

	/*
	int* arr; foo(&arr);
	printf("%d\n", arr[5]);
	*/
}