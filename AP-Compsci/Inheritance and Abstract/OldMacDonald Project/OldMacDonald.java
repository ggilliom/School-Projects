// Name: Garrett Gilliom
import java.util.Scanner;

public class OldMacDonald
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What should the cow's name be?");
    String name = keyboard.next();
    
    NamedCow aCow = new NamedCow("cow", "moo", name);
    Chick aChick = new Chick("chick", "cheep", "cluck");
    Pig aPig = new Pig("pig", "oink");
    
    Farm garrett = new Farm(aCow, aPig, aChick);
    
    garrett.animalSounds();
  }
}