// Name: Garrett Gilliom

/* Polymorphism is used in this assignment mainly through the Cow class and 
 * the NamedCow subclass. I needed aCow to be able to access Cow and 
 * NamedCow and it had to implement Animal to be able to be added to the 
 * array myAnimals. So, I made the parent class, Cow, refer to the child 
 * class, NamedCow. This allowed me to put aCow into the Array, as well as 
 * call the correct getType() method for the cow. Since Cow has a getType() 
 * method, it allows the code to compile, but during runtime, it uses the 
 * NamedCow getType() method and overrides the Cow getTyp() method because 
 * the type of Cow aCow refers to a NamedCow.
 * */

public class Farm
{
  private Animal[] myAnimals;
  
  public Farm(Cow aCow, Pig aPig, Chick aChick)
  {
    myAnimals = new Animal[3];
    myAnimals[0] = aCow;
    myAnimals[1] = aPig;
    myAnimals[2] = aChick;
  }
  
  public void animalSounds()
  {
    for(Animal item : myAnimals)
    {
      System.out.print(item.getType() + " goes ");
      System.out.println(item.getSound());
    }
  }
}