/*Project: Area and Circumference Methods, Signature of a Method, Constructor
 * Author: Robin Gao
 * Date: 1/9/18
 * Description: create a program to practice creating a circle class
 * I practiced methods
 * I had no difficulties because I was following the video tutorials
*/
public class RobinGaoMod9CircleAreaTester
{
    public static void main(String args[])
    {
        Circle cir1 = new Circle(5.1); //5.1 radius
        Circle cir2 = new Circle(20.6); //20.6 radius
        cir1.setRadiusAgain = 20; //20 is the new radius
        System.out.println(cir1.circumference()); //uses the circumference equation from the Circumference method
    }
}
/* Sample Output:
125.66370614359172
*/