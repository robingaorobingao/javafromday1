/**
 * Create and make changes to the Array Example program discussed in the lesson
 * Robin Gao
 * Module 10 Lesson 4 Practice Activity 2/13/19
 * I practiced arrays
 * I had no difficulties because everything was pretty self-explanatory
 */
public class RobinGaoChangeTest
{
    public static void main (String[] args)
    {
        RobinGaoChangeArray cng = new RobinGaoChangeArray(); 
        int[] value = {27, 19, 34, 5, 12} ;
        System.out.println("Before: ");
        cng.print(value);
        cng.zeroElt(value, 0);
        System.out.println("After: ");
        cng.print(value);
    }
}
/*
 * zeroElt() made the value 0
 * Yes
 * Whatever in cell 4 of the array would be set to 0
 * No because j as a variable only appears in that individual method
 */