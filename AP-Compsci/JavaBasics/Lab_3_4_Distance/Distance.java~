//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Garrett Gilliom
//Date - September 29, 2018
//Class - APCSA Period 8
//Lab  - 3

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
 private int xOne,yOne,xTwo,yTwo;
 private double distance;

 public Distance()
 {
   setCoordinates(0, 0, 0, 0);
 }

 public Distance(int x1, int y1, int x2, int y2)
 {
   setCoordinates(x1, y1, x2, y2);
 }

 public void setCoordinates(int x1, int y1, int x2, int y2)
 {
   xOne = x1;
   yOne = y1;
   xTwo = x2;
   yTwo = y2;
   distance = 0;
 }

 public void calcDistance()
 {
   distance = Math.round(Math.sqrt(   Math.pow(xTwo - xOne,2) + Math.pow(yTwo - yOne,2))*1000.0)/1000.0;
 }
 
 public double getDistance()
 {
   return distance;
 }
 
 public void print()
 {
   System.out.println(distance);
 }
 
 //complete print or the toString

 public String toString()
 {
  return "The distance from (" + xOne + "," + yOne + ") to (" + xTwo + "," +
    yTwo + ") is " + getDistance() + ".";
 }
} 