 
#include <stdio.h>


// STRUCT: Basically creating a new data type
typedef struct point3D {
	double x;
	double y;
	double z;
} point;

typedef struct atom_struct {
	char element[15];
	point coord;
} atom;

void moveAtom(atom theAtom, double deltaX, double deltaY, double deltaZ);
void printAtom(atom theAtom);

int main() {

	point origin = {0.0, 0.0, 0.0};
	printf("Origin: {%.2f, %.2f, %.2f}\n", origin.x, origin.y, origin.z);

	atom li = {"lithium", {1.0, 2.0, 3.0}};
	printf("Lithium: %s (%f, %f, %f)\n", li.element, li.coord.x, li.coord.y, li.coord.z);


	printAtom(li);
	moveAtom(&li, 1.0, 1.0, 1.0);
	printAtom(li);


	/*
	// all strings end in \0
	char str[5] = {'a', 'b', 'c', 'd', 'e'};
	for(int spot = 0; spot < 7; spot++){
		printf("%c ", str[spot]);
	}
	printf("\n");

	printf("%s\n", str);
	*/

	return 0;
}

void moveAtom(atom* theAtom, double deltaX, double deltaY, double deltaZ)
{
	// When using a pointer to a struct, we need to use the -> notation to
	// refer to its components instead of the .notation
	theAtom->coord.x += deltaX;
	theAtom->coord.y += deltaY;
	theAtom->coord.z += deltaZ;
}

void printAtom(atom theAtom)
{
	printf("Atom: %s (%f, %f, %f)\n", theAtom.element,
									 theAtom.coord.x,
									 theAtom.coord.y,
									 theAtom.coord.z);
}

