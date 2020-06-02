/**
 * Objects in the Utensil class have a type, a cost, and a color.
 * Methods are provided for retrieving each of these values
 * and for setting all but the type to new values. (We aren't allowed to change
 * the Utensil's type, so there is no method for it)
 * Created: Bob Roos, 3 October 2013
 * Modified: Anastasia Kurdia, 11 January 2016
 * Modified: Aaron Maus, 13 January 2020
*/
public class Utensil
{
    // INSTANCE VARIABLES:
    private String type;   // the type of utensil
    private double cost;   // cost of this utensil, in dollars
    private String color;  // the color of this utensil

    // CONSTRUCTOR:
    /**
     * Construct a new Utensil of type t; set other instance variables
     * to default values:
     * @param t a string representing the type of this utensil
    */
    public Utensil(String t)
    {
        type = t;     // store the type in an instance variable
        cost = -1;    // cost is not known
        color = null; // color is not known
    }

    // METHODS:

    /**
     * Set the cost of this utensil.
     * @param c the cost of this utensil
    */
    public void setCost(double c)
    {
        cost = c;
    }

    /**
     * Return the cost of this utensil.
     * @return the cost of this utensil.
    */
    public double getCost()
    {
        return cost;
    }

    /**
     * Set the color of this utensil.
     * @param c the color to set
    */
    public void setColor(String c)
    {
        color = c;
    }

    /**
     * Return the color of this utensil.
     * @return the color of this utensil
    */
    public String getColor()
    {
        return color;
    }

    /**
     * Return a string describing this Utensil
     * @return a string describing this Utensil
    */
    public String toString()
    {
        return color + " " + type;
    }
}
