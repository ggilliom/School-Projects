#include <stdio.h>
#include <stdlib.h>

typedef struct node_struct { // new data type
	int data;	// data
	struct node_struct* next;	// must call node_struct because node is not
} node; // called node 							   				 defined yet

void add(node* head, int num)
{
	node* newNode = (node*)malloc(sizeof(node)); // creates new node
	newNode->data = num; // assigns data to new node
	newNode->next = head->next; // assigns new node to beginning of list
	head->next = newNode; // points the head to the new node
}

void removeFirst(node* head)
{
	node* temp = head->next; // creates temp node, assigns it to beginning of list
	head->next = temp->next; // points head to temp's next node
	temp->next = NULL; // temp points to nothing
	free(temp); // frees temp's memory
}

void printList(node* head)
{
	node* current = head->next;

	while(current != NULL){
		printf("%d\n", current->data);
		current = current->next;
	}
}

void swap(int a, int b)
{
	int temp;
	temp = a;
	a = b;
	b = temp;
}

void swapPtrs(int* x, int* y)
{
	int temp;
	temp = *x;
	*x = *y;
	*y = temp;
}

int main()
{
	int intA = 1;
	int intB = 5;

	int intX = 4;
	int intY = 8;
	int* ptrX = &intX;
	int* ptrY = &intY;

	printf("intX: %d, intY: %d\n", intA, intB);
	printf("ptrX: %d, ptrY: %d\n", *ptrX, *ptrY);

	printf("SWAP\n");

	swap(intA, intB);
	swapPtrs(ptrX, ptrY);

	printf("intX: %d, intY: %d\n", intA, intB);
	printf("ptrX: %d, ptrY: %d\n", *ptrX, *ptrY);


	printf("\n");


	// head pointer created without data; NOT beginning of list, simply a
	// pointer to the beginning
	node* head = (node*)malloc(sizeof(node));
	head->next = NULL;

	node* node1 = (node*)malloc(sizeof(node));
	node1->next = NULL;
	node1->data = 1;

	node* node2 = (node*)malloc(sizeof(node));
	node2->next = NULL;
	node2->data = 2;

	head->next = node1;

	node1->next = node2;

	printf("Only pointer to first node:\n%d\n%d\n", node1->data, node1->next->data);


	add(head, 3);
	printf("Added one:\n");
	printList(head);
	removeFirst(head);
	removeFirst(head);
	printf("Removed two:\n");
	printList(head);

	return 0;
}

/*
	The * operator allows a pointer variable to access the data stored
	at the memory address that the pointer is pointing to; it dereferences
	the memory address to get the value stored there. Meanwhile, the & 
	gives us the memory address of some regular variable. So, the memory
	address of a regular variable can be assigned to a pointer variable of
	the same type using *, which can then reaccess the original value using
	the & operator.
*/


/*
	For the Linked List methods, I took a different path than either of the
	two provided and stuck to one more similar to the swap function provided.
	I simply passed in the head node pointer, did the proper node creations
	and reassignments, and that was it. The head pointer stayed the same even
	after leaving the function because the memory address stays the same
	throughout; the head->next is what changes, not the head itself.
*/


