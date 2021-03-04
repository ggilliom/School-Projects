//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Garrett Gilliom
//Date - September 23, 2018
//Class - APCSA Period 8
//Lab  - 0

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
  
 private static final int WIDTH = 800;
 private static final int HEIGHT = 600;

 public GraphicsRunner()
 {
  super("Graphics Runner");

  setSize(WIDTH,HEIGHT);

  getContentPane().add(new SmileyFace());
  
  //add other classes to run them 
  //BigHouse, Robot, or ShapePanel 

  setVisible(true);

  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

 public static void main( String args[] )
 {
  GraphicsRunner run = new GraphicsRunner();
 }
}