// A+ Computer Science  -  www.apluscompsci.com
//Name - Garrett Gilliom
//Date - March 3, 2019
//Class - APCSA Period 8
//Lab  - Winter Scene

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
  super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      window.setColor(Color.WHITE);
      window.fillOval(getXPos(), getYPos(), getWidth(), getHeight());
      window.fillOval(523, 250, 155, 155);
      window.fillOval(547, 165, 110, 110);
      window.setColor(Color.BLACK);
      window.fillRect(570, 120, 65, 65);
      window.fillRect(552, 170, 100, 15);
      window.fillOval(575, 190, 20, 20);
      window.fillOval(603, 190, 20, 20);
      window.drawString("*", 574, 243);
      window.drawString("*", 583, 248);
      window.drawString("*", 593, 250);
      window.drawString("*", 603, 248);
      window.drawString("*", 612, 243);
      window.fillOval(590, 280, 15, 15);
      window.fillOval(590, 310, 15, 15);
      window.fillOval(590, 340, 15, 15);
      window.setColor(Color.RED);
      window.fillRect(570, 160, 65, 10);
      
      //add code here to make a snowman         
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}