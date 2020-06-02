#include "Circle.h"
#include "Square.h"
#include <vector>

using namespace std;

int main()
{
  Circle circle(1); // instantiated on the stack
  Square square(3); // instantiated on the stack

  vector<Shape*> vector;
  vector.push_back(&circle);
  vector.push_back(&square);
  vector.push_back(new Square(4)); // instantiated on the heap bc "new" keyword

  for(Shape* shape: vector) {
    shape->print();
  }

  delete vector[2]; // Typically want to clean up memory on the heap
  
  return 0;
}
