public class CarRental
{
  
  private String code, key;
  
  public CarRental()
  {
    setValue("");
  }
  
  public CarRental(String plate)
  {
    setValue(plate);
  }
  
  public void setValue(String plate)
  {
    code = plate;
    key = plate;
  }
  
  public void findCode()
  {
    String letters = key.substring(0, 3);
    int number1 = (key.charAt(4) - 48) * 100;
    int number2 = (key.charAt(5) - 48) * 10;
    int number3 = (key.charAt(6) - 48);
    int numbers = number1 + number2 + number3;
    
    int letter1 = letters.charAt(0);
    int letter2 = letters.charAt(1);
    int letter3 = letters.charAt(2);
    int lettersum = letter1 + letter2 + letter3;

    int sum = lettersum + numbers;
    
    int which = sum%26;
    
    char letter = (char) (65 + which);

    String letterfin = letter + "";
    
    code = letterfin + sum;
  }
  
  public String toString()
  {
    return code;
  }
  
}