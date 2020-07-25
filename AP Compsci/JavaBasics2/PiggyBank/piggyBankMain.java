// Name: Garrett Gilliom
// Class: APCSA
// Period: 8
// Date: 10/10/18

import java.util.Scanner;

public class piggyBankMain
{
  public static void main(String[] args)
  {
    
    Scanner jeroo = new Scanner(System.in);
    System.out.print("\nWould you like to deposit?");
    String deposit = jeroo.next();
    deposit = deposit.toLowerCase();


    double pennies = 0.0;
    double nickels = 0.0;
    double dimes = 0.0;
    double quarters = 0.0;

    
    if (deposit.equals("yes")) 
    {
    System.out.print("How many pennies would you like to deposit?");
    pennies = jeroo.nextInt();
    System.out.print("How many nickels would you like to deposit?");
    nickels = jeroo.nextInt();
    System.out.print("How many dimes would you like to deposit?");
    dimes = jeroo.nextInt();
    System.out.print("How many quarters would you like to deposit?");
    quarters = jeroo.nextInt();
    }
    
    piggyBank garrett = new piggyBank(pennies, nickels, dimes, quarters);
    garrett.calcSum();
    System.out.println(garrett.toString() + "\n");
    System.out.println("There are currently:\n");
    System.out.println((int) pennies + " pennies,\n");
    System.out.println((int) nickels + " nickels,\n");
    System.out.println((int) dimes + " dimes,\n");
    System.out.println("and " + (int) quarters + " quarters\n");
    System.out.println("in your Piggy Bank.\n");
    
    

    System.out.print("Would you like to deposit?");
    String wdeposit = jeroo.next();
    wdeposit = wdeposit.toLowerCase();
    
    double wpennies = 0.0;
    double wnickels = 0.0;
    double wdimes = 0.0;
    double wquarters = 0.0;

    
    if (wdeposit.equals("yes")) 
    {
    System.out.print("How many pennies would you like to deposit?");
    wpennies = jeroo.nextInt();
    System.out.print("How many nickels would you like to deposit?");
    wnickels = jeroo.nextInt();
    System.out.print("How many dimes would you like to deposit?");
    wdimes = jeroo.nextInt();
    System.out.print("How many quarters would you like to deposit?");
    wquarters = jeroo.nextInt();
    
    garrett.piggyBank(wpennies, wnickels, wdimes, wquarters);
    garrett.calcNewSum();
    System.out.println(garrett.wtoString() + "\n");
    System.out.println("There are currently:\n");
    System.out.println((int) (pennies + wpennies) + " pennies,\n");
    System.out.println((int) (nickels + wnickels) + " nickels,\n");
    System.out.println((int) (dimes + wdimes) + " dimes,\n");
    System.out.println("and " + (int) (quarters + wquarters) + " quarters\n");
    System.out.println("in your Piggy Bank.\n");
    }
    
    
    
    System.out.println("Have a nice day!");

  }
  
}