// A+ Computer Science  -  www.apluscompsci.com
//Name - Garrett Gilliom
//Date - March 3, 2019
//Class - APCSA Period 8
//Lab  - Winter Scene

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape
{
  public FancySnowFlake(int x, int y, int w, int h )
    {
      super(x, y, w, h, Color.WHITE, 10, 10);
    }
  
   public void draw(Graphics window)
   {
       //add code here to make a snowflake
     //window.fillOval(getXPos(), getYPos(), getWidth(), getHeight());
     window.drawString("*", getXPos(), getYPos());
   }

   public void moveAndDraw(Graphics window)
   {
     setYPos((getYPos() + getYSpeed()) % 600);
     draw(window);   
   }
}
