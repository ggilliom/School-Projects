// Name: Garrett Gilliom

public class Chick implements Animal
{
  private String myType;
  private String mySound;
  
  public Chick(String type, String sound1, String sound2)
  {
    myType = type;
    double chance = Math.random();
    if(chance < .5)
    {
      mySound = sound1;
    }
    if(chance >= .5)
    {
      mySound = sound2;
    }
  }
  
  public String getSound()
  {
    return mySound;
  }
  
  public String getType()
  {
    return myType;
  }
}