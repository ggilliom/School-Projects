#ifndef SHAPE_H
#define SHAPE_H
#include "Shape.h"
#endif

class Circle: public Shape { // inherit from Shape
  double radius;

  public:
  Circle(double radius);
  void print();
  double area();
};
