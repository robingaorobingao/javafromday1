/*Project: Circle Again
 * Author: Robin Gao
 * Date: 09/27/18
 * Description: tutorial program to practice using classes, methods, and objects
 * I practiced writing a code that runs with two classes
 * I had difficulty at first because I didn't know where to put the Scanner class so I tried it in CircleAgainTester because that's where the values are going in
*/
import java.util.Scanner; //always do for Scanner
public class RobinGaoCircleAgainTester //class
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in); //Scanner
        System.out.print("Enter Radius 1: "); //displays prompt
        CircleAgain cir1 = new CircleAgain(input.nextDouble()); //radius for circle 1
        double dia1 = cir1.diameter(); //diameter for circle 1
        double area1 = cir1.area(); //area for circle 1
        System.out.print("Enter Radius 2: "); //displays prompt
        CircleAgain cir2 = new CircleAgain(input.nextDouble()); //radius for circle 2
        double dia2 = cir2.diameter(); //diameter for circle 2
        double area2 = cir2.area(); //area for circle 2
        System.out.printf("%-10s%-10s%-10s%-10s", "Circle", "Radius", "Diameter", "Area"); //first line
        System.out.println(" "); //line for spacing
        System.out.printf("%-10d%-10.1f%-10.1f%-10.1f", 1, cir1.radius, dia1, area1); //second line
        System.out.println(" "); //line for spacing
        System.out.printf("%-10d%-10.1f%-10.1f%-10.1f", 2, cir2.radius, dia2, area2); //third line
    }
}
/* Sample Output:
Enter Radius 1: 3
Enter Radius 2: 2.5
Circle    Radius    Diameter  Area       
1         3.0       6.0       28.3       
2         2.5       5.0       19.6
*/