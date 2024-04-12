/**
 * Big Bucks in the Bank
 * Robin Gao 3/6/19
 * Create a program to practice your understanding of constants and calculations
 * I practiced loops and ArrayList
 * I had difficulty with the loops because there were a lot to consider but it took trial and error to figure it all out
 */
import java.io.*;
import java.util.*; //scanner things
public class RobinGaoMod11BigBucks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        ArrayList <String> accounts = new ArrayList <String>();
        ArrayList <Double> deposits = new ArrayList <Double>();
        String response, name; //declared here for the entire code
        Double compareDeposit = 0.0, amount; //declared here for the entire code
        int count = 0; //loop iterations
        do
        {
            System.out.print("Please enter the name of the account (\"Exit\" to abort): ");
            String user = input.next(); //response input
            response = user.toLowerCase().substring(0, 1); //takes the first letter
            accounts.add(user);
            if (response.equals("e"))
            {} //won't run if input is "Exit"
            else
            {
                System.out.print("Please enter the amount of the deposit: ");
                Double deposit = input.nextDouble();
                RobinGaoBankAccount account = new RobinGaoBankAccount();
                if (count == 0 || compareDeposit > deposit) //this finds the largest balance with account name
                {
                    name = account.getName();
                    amount = account.getBalance();
                    System.out.println("The largest balance belongs to " + name + "." + "\nThe amount is " + amount + ".");
                }
                count++; //number of loops
                compareDeposit = deposit; //previous deposit amount turns into new deposit amount for comparison
            }
        }
        while (!response.equals("e")); //stops if the input is exit, but really stops because of the if else loop
    }
}
/* sample output:
Please enter the name of the account ("Exit" to abort): me
Please enter the amount of the deposit: 20
The largest balance belongs to null.
The amount is 0.0.
Please enter the name of the account ("Exit" to abort): mi
Please enter the amount of the deposit: 50
Please enter the name of the account ("Exit" to abort): ex

*/