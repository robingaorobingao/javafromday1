/**
 * Write a program that will prompt the user to enter the hourly rate, the total consulting time, and the customer income
 * Robin Gao
 * Taxes 2/2/19
 * I practiced methods, variables, and instances
 * I had difficulty with the formulas for calculating the rates so I just took some time to figure them out
 */
public class RobinGaoMod9TaxService
{
    /**
     * Constructor for objects of class RobinGaoMod9TaxService
     */
    public RobinGaoMod9TaxService()
    {}
    /**
     * Method to calculate fee
     * @param double time
     * @param double rate
     * @return fee
     */
    public double calculation(double time, double rate)
    {
        return time * rate;
    }
}
/* sample output:
What is the hourly rate? 50
What is the consulting mins in minutes? 50
What is the income? 50000
What is the consulting fee?: $12   
Would you like to enter another? no
*/