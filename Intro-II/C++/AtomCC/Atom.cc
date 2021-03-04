#include <iostream>
#include <cstdio>
#include "Atom.h"
using namespace std;


// Can have constructors
Atom::Atom(string name, double x, double y, double z)
{
	element = name;
	// this refers to a pointer to this instance of this class.
	// Must use the pointer (->) notation.
	this->x = x;
	this->y = y;
	this->z = z;
}

Atom::~Atom()
{
	// We would free all memory allocated on the heap.
	cout << "Atom deconstructor for " << element << " run." << endl;
}

// as many methods as we like
void Atom::print()
{
	cout << "element: " << element << endl;
	printf("coords: (%.1f, %.1f, %.1f)\n", x, y, z);
}