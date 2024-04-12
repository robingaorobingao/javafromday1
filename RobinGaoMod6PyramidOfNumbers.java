/*Project: Pyramid of Numbers
 * Author: Robin Gao
 * Date: 11/20/18
 * Description: Write a program to print a pyramid of numbers through 9. This pyramid will increase to a specific number and then decrease back down.
 * I practiced using loops
 * I had difficulty with printing format because I originally tried using printf but since the statement would have to change for each row it would be difficult for the for loop and so instead I formatted the pyramid with spaces that were determined by the row number
*/
public class RobinGaoMod6PyramidOfNumbers //class
{
    public static void main(String[] args) //main method
    {
        int rowNumber = 1, number; //declaring variables for number of rows and row number
        for (int rows = 9; rows > 0; rows--) //nine rows
        {
            for (number = 1; number <= rows; number++)
            {
                System.out.print(" "); //spaces for formatting                
            }
            for (number = 1; number <= rowNumber; number++) //this prints the "first half" of the numbers
            {
                System.out.print(number); //print so that it's all on the same line
            }
            for (number = rowNumber - 1; number >= 1; number--) //this prints the "second half" of the numbers
            {
                System.out.print(number); //print so that it's all on the same line
            }
            System.out.println(); //new line for the next line of numbers
            rowNumber++; //increases the row number each time
        }
    }
}
/* Sample Output:
         1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
*/