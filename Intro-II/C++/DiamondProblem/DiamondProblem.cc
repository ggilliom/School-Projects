#include <iostream>
using namespace std;

class Animal {
private:
	string name;
public:
	Animal() { // no need to Animal::Animal() since we are defining and implementing in the same place
		cout << "Animal () called" << endl;
		name = "Animal";
	}
	Animal(string name) {
		cout << "Animal (String) called" << endl;
		this->name = name; // "this" evaluates to be a pointer to the instance of this class
	}
	string getName() {
		return name;
	}
};

class Fish: virtual public Animal {
public:
	Fish(string name): Animal(name){
		cout << "Fish(String) called" << endl;

	}
};

class Mammal: virtual public Animal {
public:
	Mammal(string name): Animal(name){
		cout << "Mammal(String) called" << endl;

	}
};

class Whale: public Mammal, public Fish {
public:
	Whale(string name): Mammal(name), Fish(name), Animal(name) {
		cout << "Whale(String) called" << endl;
	}
};

int main()
{
	/*
	Animal a("A"); // instantiate an animal using the default constructor. Stored on the Stack
	Animal* b = new Animal("B"); // b stored on the Heap // New
	cout << a.getName() << endl;
	cout << b->getName() << endl;

	Fish dory("Dory");
	cout << dory.getName() << endl;
	Mammal landLubber("LandLubber");

	delete b; 
	*/
	Whale bigBuddy("Big Buddy");
	cout << bigBuddy.getName() << endl;
	return 0;
}