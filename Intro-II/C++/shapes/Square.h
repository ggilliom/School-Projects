#ifndef SHAPE_H
#define SHAPE_H
#include "Shape.h"
#endif

class Square: public Shape { // inherit from Shape
  double length;

  public:
  Square(double length);
  void print();
  double area();
};
