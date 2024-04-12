/*Project: Super Sale
 * Author: Robin Gao
 * Date: 10/04/18
 * Description: Enter purchase price and print final price with discount and tax
 * I practiced making if else statements and using printf
 * I had difficulty with spacing because I forgot that printf didn't make separate lines of text so I went in and manually coded additional println lines
*/
import java.io.*;
import java.util.*;
public class RobinGaoM5L3Assignment //class
{
    public static void main(String[] args) //main method
    {
        Scanner input = new Scanner (System.in); //Scanner
        System.out.print("Enter purchase price: $"); //prompts for purchase price
        double purchase = input.nextDouble(), tax = 0.06 * purchase , smallDiscount = 0.1 * purchase, bigDiscount = 0.2 * purchase, smallSale = purchase - smallDiscount, bigSale = purchase - bigDiscount; //doubles
        if (purchase > 100)
        {
            System.out.println(" "); //spacing
            System.out.printf("%-20s%-5.2f", "Purchase price:", purchase); //prints purchase price
            System.out.println(" "); //spacing
            System.out.printf("%-20s%-5.2f", "Discount (20%):", bigDiscount); //prints discount
            System.out.println(" "); //spacing
            System.out.printf("%-20s%-5.2f", "Sale price:", bigSale); //prints sale price
            System.out.println(" "); //spacing
            System.out.printf("%-20s%-5.2f", "Tax:", tax); //prints tax
            System.out.println(" "); //spacing
            System.out.printf("%-20s%-5.2f", "Final price:", bigSale + tax); //prints final price
            System.out.println(" "); //spacing
        }
        else
        {
            System.out.println(" "); //spacing
            System.out.printf("%-20s%5.2f", "Purchase price:", purchase); //prints purchase price
            System.out.println(" "); //spacing
            System.out.printf("%-20s%5.2f", "Discount (10%):", smallDiscount); //prints discount
            System.out.println(" "); //spacing
            System.out.printf("%-20s%5.2f", "Sale price:", smallSale); //prints sale price
            System.out.println(" "); //spacing
            System.out.printf("%-20s%5.2f", "Tax:", tax); //prints tax
            System.out.println(" "); //spacing
            System.out.printf("%-20s%5.2f", "Final price:", smallSale + tax); //prints final price
            System.out.println(" "); //spacing
        }
    }
}
/* Sample Output:
Enter purchase price: $99
 
Purchase price:     99.00 
Discount (10%):     9.90  
Sale price:         89.10 
Tax:                5.94  
Final price:        95.04
*/