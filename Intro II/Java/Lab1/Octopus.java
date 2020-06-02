/**
 * A simple class that represents an Octopus with an age, a weight, a
 * name, and a favorite cooking utensil. Methods are provided for
 * retrieving each of these values and for setting all but the name to
 * new values. (We aren't allowed to change the Octopus's name, so there
 * is no method for this)
 * Created: Bob Roos, 3 October 2013
 * Modified: Anastasia Kurdia, 11 January 2016
 * Modified: Aaron Maus, 13 January 2020
*/
public class Octopus
{
    // INSTANCE VARIABLES:
    private int age;         // this Octopus's age, in years
    private double weight;   // this Octopus's weight, in pounds
    private String name;     // this Octopus's name
    private Utensil utensil; // this Octopus's favorite kitchen utensil

    // CONSTRUCTOR
    /**
     * Construct an Octopus with a given name n; all other
     * instance variables assigned default values.
     * @param n the name of the Octopus
    */
    public Octopus(String n, int a)
    {
        name = n;         // store the name in the appropriate instance variable
        age = a;         // we don't know the Octopus's age yet
        weight = -1;      // we don't know the Octopus's weight yet
        utensil = null;   // we don't know the Octopus's favoriet utensil yet
    }

    // METHODS:
    /**
     * Set the Octopus' age to the value stored in parameter a.
     * @param a the value to set this Octopus' age to
    */
    public void setAge(int a)
    {
        age = a;
    }


    /**
     * Return the Octopus' age.
     * @return the octopus' age
    */
    public int getAge()
    {
        return age;
    }

    /**
     * Set the Octopus's weight.
     * @param w the value to set the octopus' weight to
    */
    public void setWeight(double w)
    {
        weight = w;
    }

    /**
     * Return the Octopus's weight.
     * @return the Octopus' weight
    */
    public double getWeight()
    {
        return weight;
    }

    /**
     * Set the Octopus's favorite utensil.
     * @param u the utensil to set
    */
    public void setUtensil(Utensil u)
    {
        utensil = u;
    }

    /**
     * Return the Octopus' favorite utensil.
     * @return the Octopus' favorite utensil.
    */
    public Utensil getUtensil()
    {
        return utensil;
    }

    /**
     * Return the Octopus' name.
     * @return the Octopus' name
    */
    public String getName()
    {
        return name;
    }

    /**
     * Return a short description of this octopus. Here,
     * we'll just use the name
     * @return the description
    */
    public String toString()
    {
        return "An octopus named " + name;
    }
}
