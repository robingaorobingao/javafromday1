/*Project: Module 5 Switch
 * Author: Robin Gao
 * Date: 10/23/18
 * Description: follow the video tutorial
 * I learned how to test for equality using boolean operators
 * I had no difficulty because I was following the video tutorial
*/
import java.io.*;
import java.util.*;
public class RobinGaoMod5Switch //class
{
	public static void main(String[] args) //main method
	{
		System.out.println("Make your arithmetic selection from the choices below:\n"); //displays prompt
		System.out.println("1. addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division\n");
		System.out.println("   Your choice? ");
		
		Scanner kbReader = new Scanner(System.in);
		int choice = kbReader.nextInt();
		
		System.out.print("\nEnter first operand");
		double op1 = kbReader.nextDouble();
		
		System.out.print("\nEnter second operand");
		double op2 = kbReader.nextDouble();
		
		switch(choice)
		{
		    case 1: //addition
		    System.out.print(op1 + " plus " + op2 + " = " + (op1 + op2));
		    break;
		    case 2: //subtraction
		    System.out.print(op1 + " minus " + op2 + " = " + (op1 - op2));
		    break;
		    case 3: //multiplication
		    System.out.print(op1 + " times " + op2 + " = " + (op1 * op2));
		    break;
		    case 4: //division
		    System.out.print(op1 + " divided by " + op2 + " = " + (op1 / op2));
		    break;
		    default:
		    System.out.print("Please enter only 1, 2, 3, 4");
		}
	}
}
/* Sample Output:
Make your arithmetic selection from the choices below:

1. addition
2. subtraction
3. multiplication
4. division

   Your choice? 3

Enter first operand 5

Enter second operand 6
5.0 times 6.0 = 30.0
*/