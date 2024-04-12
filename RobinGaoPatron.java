/**
 * Create a program to practice your understanding of polymorphism
 * Robin Gao
 * Module Fourteen Lesson Three Practice Activity 04/11/19
 * I practiced inheritance and polymorphism
 * I had no difficulties because I was following the videos
 */
import java.util.Calendar;
public class RobinGaoPatron
{
    // instance variables
    private String FName;
    private String LName;
    private String LibNumber;
    private RobinGaoMedia myMedia;
    /**
     * Constructor for objects of class Patron
     */
    public RobinGaoPatron()
    {
        FName = null;
        LName = null;
        LibNumber = null;
        myMedia = null;
    }
    /**
     * Constructor for objects of class Patron
     */
    public RobinGaoPatron(String f, String l, String ln, RobinGaoMedia b)
    {
        FName = f;
        LName = l;
        LibNumber = ln;
        myMedia = b;
    }
    /********** Accessors (getters) **********/
    public String getFName()
    {
        return FName;
    }
    public String getLName()
    {
        return LName;
    }
    public String getLibNumber()
    {
        return LibNumber;
    }
    public RobinGaoMedia getMedia()
    {
        return myMedia;
    }
    /********** Mutators (setters) **********/
    public void setFName(String f)
    {
        FName = f;
    }
    public void setLName(String l)
    {
        LName = l;
    }
    public void setLibNumber(String ln)
    {
        LibNumber = ln;
    }
    public void setMedia(RobinGaoMedia b)
    {
        myMedia = b;
    }
    /**
     * Prints the specs of the book object
     * return String
     */
    public String toString()
    {
        String str = "The specs of this Patron are: ";
        str += "\n\t First name: " + FName;
        str += "\n\t Last name: " + LName;
        str += "\n\t Libary number: " + LibNumber;
        str += "\n\t Media: " + myMedia;
        return str;
    }
}
/* Sample output:
The specs of this book are:
    Title: ABC
    Author: Suzie Smith
    Checkout date: 3/5
*/