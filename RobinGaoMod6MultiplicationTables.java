/*Project: Multiplication Tables
 * Author: Robin Gao
 * Date: 11/6/18
 * Description: create a “cheat” sheet to let students look up the number on a table
 * I practiced creating loops
 * I had difficulty with what to put in the printf format code but I fixed it after referencing a past assignment
*/
public class RobinGaoMod6MultiplicationTables //class
{
    public static void main(String[] args) //main method
    {
        int multiplier1, multiplier2;
        for (multiplier1 = 1; multiplier1 <= 12; multiplier1++) //numbers between 1 and 12
        {
            for (multiplier2 = 1; multiplier2 <= 12; multiplier2++) //numbers between 1 and 12
            {
                int product = multiplier1 * multiplier2;
                System.out.printf("%-5d", product); //prints products
            }
             System.out.println(); //prints next row of products
        }
    }
}
/* Sample Output:
1    2    3    4    5    6    7    8    9    10   11   12   
2    4    6    8    10   12   14   16   18   20   22   24   
3    6    9    12   15   18   21   24   27   30   33   36   
4    8    12   16   20   24   28   32   36   40   44   48   
5    10   15   20   25   30   35   40   45   50   55   60   
6    12   18   24   30   36   42   48   54   60   66   72   
7    14   21   28   35   42   49   56   63   70   77   84   
8    16   24   32   40   48   56   64   72   80   88   96   
9    18   27   36   45   54   63   72   81   90   99   108  
10   20   30   40   50   60   70   80   90   100  110  120  
11   22   33   44   55   66   77   88   99   110  121  132  
12   24   36   48   60   72   84   96   108  120  132  144  
*/