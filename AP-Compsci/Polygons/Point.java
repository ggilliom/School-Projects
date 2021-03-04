// Name: Garrett Gilliom

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Point
{
  private int x;
  private int y;

  public Point()
  {
    x = 0;
    y = 0;
  }

  public Point(int xCor, int yCor)
  {
    x = xCor;
    y = yCor;
  }
  
  public void setValues(int xCor, int yCor)
  {
    x = xCor;
    y = yCor;
  }
  
  public double getY()
  {
    return (double)y;
  }

  public double getX()
  {
    return (double)x;
  }

  public double getDistance(Object obj)
  {
    Point other = (Point)obj;
    double distance = Math.sqrt(Math.pow(other.getX() - getX(),2) + Math.pow(other.getY() - getY(),2));  
    return distance;
  }
  
  public boolean equals(Object obj)
  {
    Point other = (Point)obj;
    if(getX() == other.getX() && getY() == other.getY())
    {
      return true;
    }
    return false;
  }

}