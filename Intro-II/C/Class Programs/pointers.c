#include <stdio.h>
#include <stdlib.h>
// compile and run: gcc pointers.c -o pointers && ./pointers

void swap(int* px, int* py);
void pointersAndArrays();
void pointersBasics();
void arraysOfStrings();
int strLength(char* str);
void memorymgt();


int main(int argc, char* argv[])
{
	// Command Line Arguments
	// The 0th argument is always the name of the program.
	// Every command line argument, split by white space, follows
	for(int spot = 0; spot < argc; spot++){
		printf("%s\n", argv[spot]);
	}

	// pointersBasics();
	// pointersAndArrays();
	// arraysOfStrings();

	// Memoryt Management: malloc() and free()
	memorymgt();

	return 0;
}

void pointersBasics()
{
	// a pointer contains the memory address of some value in memory
	int x = 10;
	// Use * to declare a pointer, & to get the memory address of some variable
	int *xpt = &x;

	printf("%d\n", x);
	// * is referred to as the dereferencing operator because we can use
	// it to get the VALUE back out from the POINTER. That is, we can
	// dereference the pointer
	printf("%d\n", *xpt);

	x = -10;
	printf("%d\n", *xpt); // will see the update to -10

	// Recap: When using pointers, we have TWO operators: & and *.

	int foo = 13;
	int bar = 27;

	printf("foo: %d, bar: %d\n", foo, bar);
	swap(&foo, &bar); // passes in the memory addresses of foo and bar
	printf("foo: %d, bar: %d\n", foo, bar);

	printf("%p\n", &foo); // printing the memory address

}

void arraysOfStrings()
{
	// A difficulty with strings is that often, we don't
	// know how much space we need until runtime, eg, user
	// input
	char* str ="some strings";
	printf("%s\n", str);

	// space inefficient way of storing all lines in a file
	// not every line will need 20 characters, other lines will
	// need more. In reality, the second dimension should be the
	// length of the longest line.
	// char lines[10][20]; // waste of space

	// since we can store in char* strings of arbitrary length,
	// we use that to our advantage and create an array of char*
	char* lines[10]; // allows for 10 strings of differing lengths
	lines[0] = "ghurwoa";
	lines[1] = "fghoqruwn";
	lines[2] = "Hello";

	for(int spot = 0; spot < 3; spot++){
		printf("%s\n", lines[spot]);
	}

	// Tangent on calculating the length of an array
	// With a standard array, we can calculate its length using
	// sizeof() and then number of elements in the array
	int arr[10];
	// can determine size by dividng the total size of the array
	// (in bytes) by the size of the elements of the array
	int length = sizeof(arr)/sizeof(arr[0]);
	printf("Length of arr: %d\n", length);

	// With a char* str[] type, this is a little trickier
	// Can calculate the length of each string knowing that they
	// all end in \0
	printf("length of lines[2]: %d\n", strLength(lines[2]));

}

int strLength(char* str)
{
	// abc\0
	int index = 0;
	while(str[index] != '\0'){
		index++;
	}
	return index; // number of elemts in the array
}




void pointersAndArrays()
{
	printf("\nPointers and Arrays\n");
	// An array is a contiguous block of memory.
	int arr[5] = {2, 3, 5, 7, 11};
	int* parr;
	// parr = &arr[0]; 
	parr = arr; // an array by default is a pointer to its 0th value

	printf("%d\n", *parr);
	printf("%d\n", arr[0]);

	// Pointer Arithmetic
	// We can increment a pointer to move forward in memory.
	// parr+1 refers to the value 1 forward in memory from parr
	// TO retrieve that element, need to dereference it
	// *(parr+1)
	printf("%d\n", *(parr+2));
	printf("%p\n", parr);
	// prints the value of parr, then increments the pointer to 
	// the next int
	printf("%d\n", *(parr++)); 
	printf("%p\n", parr);
	// will print out next value due to the post increment
	printf("%d\n", *parr);
	// Print using standard array notation
	printf("%d\n", parr[0]);
	printf("%d\n", *(arr+1));

	for(int spot = 0; spot < 5; spot++){
		printf("%d\n", *(arr+spot));
	}



}

void swap(int* px, int* py)
{
	int temp = *px;
	*px = *py;
	*py = temp;
}

void memorymgt()
{
	// we can declare an array of any size as long as we know at compile
	// time how large it should be
	int nums[10];

	// If we don't know how muych data we need to store until runtime,
	// we can use malloc function to allocate as much memory as we
	// think we need, malloc(memory allocate)
	int numVals = 5;
	// malloc() allocates a certain number of BYTES. TO use it, you need
	// to determine the number of byte by multiplying the number of
	// elements by the size of each element.
	// malloc() returns a void pointer since it doesn't know what we intent
	// to store in memory. We need to cast it to our appropriate type.
	int* vals = (int*)malloc(numVals * sizeof(int));

	vals[0] = 1;
	vals[1] = 2;
	vals[2] = 3;
	vals[3] = 4;
	vals[4] = 5;

	for(int spot = 0; spot < numVals; spot++){
		printf("%d\n", vals[spot]);
	}

	// malloc() allocates memory on the HEAP and this memory will NOT be
	// automatically de-allocated when the method finishes.
	// So, in order to avoid memory leaks, you should always FREE memory
	// that you've allocated as soon as you no longer need it
	free(vals);

}





