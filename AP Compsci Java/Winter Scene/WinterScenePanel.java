// A+ Computer Science  -  www.apluscompsci.com
//Name - Garrett Gilliom
//Date - March 3, 2019
//Class - APCSA Period 8
//Lab  - Winter Scene

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinterScenePanel extends JPanel implements Runnable
{
 private AbstractShape[] shapes;  
 private AbstractShape sMan; //

 public WinterScenePanel()
 {
   setVisible(true);
   //instantiate the array to hold 50 AbstractShape references
   shapes = new AbstractShape[100];
   for(int spot = 0; spot < 100; spot++)
   {
     shapes[spot] = new FancySnowFlake((int)(Math.random() * 800), (int)(Math.random() * 600), 7, 7);   
   }
   //populate the array with 50 unique snowflakes
  
   sMan = new SnowMan(500, 350, 200, 200);
   //instantiate a snowman
  
   new Thread(this).start();
 }
 
 public void update(Graphics window)
 {
  paint(window); 
 }

 public void paint(Graphics window)
 {
  window.setColor(Color.BLUE);
  window.fillRect(0,0,getWidth(), getHeight());
  window.setColor(Color.WHITE);
  window.drawRect(20,20,getWidth()-40,getHeight()-40);
  window.setFont(new Font("TAHOMA",Font.BOLD,18));
  window.drawString("MAKE A WINTER SCENE!",40,40);
  sMan.draw(window); //make the snowman appear
  Color brownColor = new Color(102, 51, 0);
  window.setColor(brownColor);
  window.fillRect(180, 250, 100, 300);
  Color darkGreenColor = new Color(0, 102, 0);
  window.setColor(darkGreenColor);
  window.fillRect(105, 110, 250, 210);
  
  
  //make the snowflakes appear and move down the screen
   window.setColor(Color.WHITE);
   for(int spot = 0; spot < 100; spot++)
   {
     shapes[spot].moveAndDraw(window);
   }
  //check to see if any of the snowflakes need to be reset to the top of the screen
 }
 
   public void run()
   {
    try
    {
     while(true)
     {
        Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
   } 
}