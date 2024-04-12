/**
 * Create a program to practice your understanding of 2 Dimensional Arrays
 * Robin Gao
 * Module 12 Lesson 1 Assignment 1 3/12/19
 * I practiced two dimensional arrays
 * I had no difficulties because I used the notes from the videos as reference
 */
import java.io.* ;
public class RobinGaoMod12Assignment1pt2
{
    public static void main (String[] args)
    {
        int[][] data = {{3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8}};
        // declare the sum
        int sum;
        // compute the sums for each col
        for (int col = 0; col < 6; col++)
        {
            // initialize the sum
          sum = 0;
          // compute the sum for this column
          for (int row = 0; row < data.length; row++)
          {
              if (col < data[row].length)
              {
                  sum += data[row][col];
              }
          }
          // write the sum for this column
          System.out.println("Sum for column " + (col + 1) + ": " + sum);
        }
    }
} 
/* sample output:
Sum for column 1: 13
Sum for column 2: 9
Sum for column 3: 15
Sum for column 4: 13
Sum for column 5: 12
Sum for column 6: -8
*/