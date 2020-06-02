#include <iostream>
using namespace std;


// Can declare classes just like we do in Java.
// In C++, we cannot use access modifers to declare a class. However,
// they CAN be applied to members of the class, just like in Java.
class  Atom {
	// Instance variables
	private:
		string element;
		double x;
		double y;
		double z;

	public:
		Atom(string name, double x, double y, double z);
		~Atom();
		void print();
};