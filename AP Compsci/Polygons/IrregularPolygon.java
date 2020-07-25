// Name: Garrett Gilliom

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class IrregularPolygon //extends Canvas
{
  
  private Point[] myPoints;
  
  public IrregularPolygon(int points)  
   {
     myPoints = new Point[points];
   }
  
  public void add(int spot, Point aPoint)
  {
    myPoints[spot] = aPoint;
  }
  
  public double perimeter()
  {
    
    double perimeter = 0.0;
    
    for(int spot = 0; spot < myPoints.length - 1; spot++)
    {
      
      perimeter = perimeter + myPoints[spot].getDistance(myPoints[spot + 1]);
      
    }
    
    perimeter = perimeter + myPoints[myPoints.length - 1].getDistance(myPoints[0]);
    
    return Math.round(perimeter * 10.0) / 10.0;
    
  }
  
  public double area()
  {
    
    double added = 0.0;
    double subtracted = 0.0;
    double plus = 0.0;
    double minus = 0.0;
    
    for(int spot = 0; spot < myPoints.length - 1; spot++)
    {
      plus = myPoints[spot].getX() * myPoints[spot + 1].getY();
      
      added = added + plus;
    }
    
    added = added + (myPoints[myPoints.length - 1].getX() * myPoints[0].getY());
    
    for(int spot = 0; spot < myPoints.length - 1; spot++)
    {
      minus = myPoints[spot].getY() * myPoints[spot + 1].getX(); 
      
      subtracted = subtracted - minus;
    }
    
    subtracted = subtracted - (myPoints[myPoints.length - 1].getY() * myPoints[0].getX());
    
    double total = added + subtracted;
    double area = Math.abs(total / 2);
    return area;
    
  }
  
  /*public IrregularPolygon()
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint(Graphics window) // Could not get this to work...
   {                                  // I think the for loop is causing 
     window.setColor(Color.BLACK);    // it to mess up and not show anything
     
     for(int spot = 0; spot < myPoints.length - 1; spot++)
      {
        window.drawLine((int)myPoints[spot].getX(), (int)myPoints[spot].getY(), (int)myPoints[spot + 1].getX(), (int)myPoints[spot + 1].getY());
      }
     
      window.drawLine((int)myPoints[myPoints.length - 1].getX(), (int)myPoints[myPoints.length - 1].getY(), (int)myPoints[0].getX(), (int)myPoints[0].getY());   
   }*/
   
}