#include <iostream>
#include "Atom.h"
using namespace std;

namespace us
{
	typedef struct point3d {
		double x;
		double y;
		double z;
	} point;

	typedef struct atom_struct {
		string element; // string comes from std::, has useful functions lke length()
		point coord;
		//string element;
	} atom;
}




int main(){
	// First implemented in 1979 as "C with Classes" by Bjarne Stroustrup
	// at Bell Labs. Meants to keep the efficiency and low=level power of
	// C but add on Object-oriented features.

	// It was renamed C++ in 1983. Bjarne published his reference book "The C++
	// Programming Language" in 1985.

	// C++ has more low-level power but can be more difficult to use than
	// more modern languages like C+ or Java. Why? C++ gives the programmer
	// the powe of direct memory management. In comparison, Java handles
	// memory management with its garbage collector, making programs
	// easier to write, but alower to run because of the overhead of the
	// garbage collector.

	// In our introductive to C++, we'll discuss NAMESPACES, how to write
	// classes and use INHERITANCE, and C++'s implementation of generics
	// called TEMPLATES.


	// Namespaces are a mechanism that allows us to uniquely identify C++
	// entities. In C, there is no mechanism for declaring packages or
	// naming scope. If we include two libraries, both with the function
	// init(), we can't compile the program. Name clash! To uniquely name
	// functions in libraries, C developers tend to prepend or append
	// unique strings to all functions.

	// The first namespace beginner programmers see is std namespace.
	//std::cout << "Hello World\n";
	// Can simply call on cout if we have "using namespace std" at top.
	cout << "Hello world\n";

	// create an atom struct from discussion of struct
	us::atom curium = {"curium", 0.0, 0.0, 0.0};

	// Construct an Atom object!
	// This instantiates an atom on the stack!
	// This atom object is local to this function.
	// When the function returns, the memory holding the atom is
	// released and the atom no longer exists.
	Atom c("curium", 0.0, 0.0, 0.0);
	c.print();

	// Construct an Atom on the HEAP.
	// When this function returns, this atom on the HEAP will not
	// be released.
	// When we finish with this object, we need to release this object's
	// memory
	Atom* f = new Atom("fermium", 0.0, 0.0, 0.0); // returns a pointer to fermium
	// Since we are explicitly responsible for releasing the memory of all
	// of our objects constructed, we are responsible for
	// defining DECONTRUCTORS. A deconstructor is responsible for
	// releasing all of the memory of the object that needs to be
	// released. For example, if I have a protein object which consists of 
	// hundreds of atoms, in the protein deconstructor I may need to
	// release the memory of each atom if I constructed them all on the
	// heap
	f->print();
	delete f;

	


	return 0;
}





