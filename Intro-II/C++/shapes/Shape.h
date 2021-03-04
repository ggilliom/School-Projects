#include <iostream>
using namespace std;
class Shape {
  string name;

  public:
  Shape(string name);
  // virtual indicates that this function can be OVERRIDDEN
  virtual void print();
  // This bizarre syntax indicates an abstract method
  virtual double area() = 0;
};
