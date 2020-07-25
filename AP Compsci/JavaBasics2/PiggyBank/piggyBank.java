// Name: Garrett Gilliom
// Class: APCSA
// Period: 8
// Date: 10/10/18

public class piggyBank
{
  private double total, wtotal;
  private double oneies, fiveies, tenies, biggies;
  private double woneies, wfiveies, wtenies, wbiggies;


  public piggyBank(double pennies, double nickels, double dimes, double quarters)
  {
    setNums(pennies, nickels, dimes, quarters);
  }
  
  public void piggyBank(double wpennies, double wnickels, double wdimes, double wquarters)
  {
    wsetNums(wpennies, wnickels, wdimes, wquarters);
  }

  public void setNums(double pennies, double nickels, double dimes, double quarters)
  {
    oneies = pennies * .01;
    fiveies = nickels * .05;
    tenies = dimes * .1;
    biggies = quarters * .25;
    total = 0.0;
  }
  
  public void wsetNums(double wpennies, double wnickels, double wdimes, double wquarters)
  {
    woneies = wpennies * .01;
    wfiveies = wnickels * .05;
    wtenies = wdimes * .1;
    wbiggies = wquarters * .25;
    wtotal = 0.0;
  }

  public void calcSum()
  {
    total = (Math.round((oneies + fiveies + tenies + biggies)*1000.0))/1000.0;

  }
  
  public void calcNewSum()
  {
    calcSum();
    wtotal = (Math.round((oneies + fiveies + tenies + biggies + woneies + wfiveies + wtenies + wbiggies)*1000.0))/1000.0;    

  }
  
  public double getSum()
  {
    return total;
  }
  
  public double wgetSum()
  {
    return wtotal;
  }
  

  public String toString()
  {
      return  "Your total is $" + getSum();
  }
  
    public String wtoString()
  {
      return  "Your total is $" + wgetSum();
  }
  
}