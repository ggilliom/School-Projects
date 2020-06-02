/** 
 * This program models the work of an octopus in the kitchen
 * and tests the work of Octopus and Utensil class functions
 * Created: Bob Roos, 3 October 2013
 * Edited: Anastasia Kurdia, 11 January 2016
 * Edited: Aaron Maus, 13 January 2020
*/
public class Lab1
{
    public static void main(String[] args)
    {
        // Variable dictionary:
        Octopus ocky;           // an octopus
        Utensil spat;           // a kitchen utensil

        spat = new Utensil("spatula"); // create a spatula
        spat.setColor("green");        // set spatula properties--color...
        spat.setCost(10.59);           // ... and price

        ocky = new Octopus("Ocky", 10);    // create and name the octopus
        //ocky.setAge(10);               // set the octopus's age...
        ocky.setWeight(100);           // ... weight,...
        ocky.setUtensil(spat);         // ... and favorite utensil.

        Octopus mary = new Octopus("Mary", 18);     // create and name the octopus
        Utensil spork = new Utensil("spork");       // create a new utensil
        spork.setColor("yellow");       // set spork color
        spork.setCost(2.69);     // set spork price

        mary.setUtensil(spork);
        System.out.println(mary.getName() + " weighs " + mary.getWeight() // print second octopus
            + " pounds\n" + "and is " + mary.getAge()
            + " years old. Her favorite utensil is a "
            + mary.getUtensil());

        System.out.println(mary.getName() + "'s " + mary.getUtensil() + " costs $" // print second utensil
            + mary.getUtensil().getCost());
        System.out.println("Utensil's color: " + spork.getColor());


        System.out.println("Testing 'get' methods:");
        System.out.println(ocky.getName() + " weighs " +ocky.getWeight()
            + " pounds\n" + "and is " + ocky.getAge()
            + " years old. His favorite utensil is a "
            + ocky.getUtensil());

        System.out.println(ocky.getName() + "'s " + ocky.getUtensil() + " costs $"
            + ocky.getUtensil().getCost());
        System.out.println("Utensil's color: " + spat.getColor());

        // Use methods to change some values:

        ocky.setAge(20);
        ocky.setWeight(125);
        spat.setCost(15.99);
        spat.setColor("blue");

        System.out.println("\nTesting 'set' methods:");
        System.out.println(ocky.getName() + "'s new age: " + ocky.getAge());
        System.out.println(ocky.getName() + "'s new weight: " + ocky.getWeight());
        System.out.println("Utensil's new cost: $" + spat.getCost());
        System.out.println("Utensil's new color: " + spat.getColor());
    }
}
