#include "Square.h"

Square::Square(double length): Shape("Square")
{
  this->length = length;
}

void Square::print()
{
  Shape::print();
  printf("Length: %.2f\n", this->length);
  printf("Area: %.2f\n", area());
}

double Square::area()
{
  return this->length * this->length;
}
