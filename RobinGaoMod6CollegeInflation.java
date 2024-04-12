/*Project: College Inflation
 * Author: Robin Gao
 * Date: 11/7/18
 * Description: Write a program that will help Kayla determine the surplus or deficit that she can anticipate if her projections are accurate.  A final row at the end of the output should provide totals for the four years she is in college.
 * I practiced making loops
 * I had difficulty with my excess/shortage values because they weren't working out mathematically but I fixed it by rearranging where I declared my excessShortage and newExcessShortage variables
*/
public class RobinGaoMod6CollegeInflation //class
{
    public static void main(String[] args) //main method
    {
        System.out.printf("%-14s%-17s%-15s%-20s%-16s%-25s\n" , "Year", "Tuition", "Rm&Bd", "Total Cost", "Salary", "Excess/Shortage"); //prints top line
        double year = 1, tuition = 4000, tuitionRate = 1.15,newTuition = 0, roomBoard = 9500, newRoomBoard = 0, rbRate = 1.1, totalCost = tuition + roomBoard, newTotalCost = 0, salary = 14000, salaryRate = 1.04, newSalary = 0, newExcessShortage = 0; //variables
        for (year = 1; year <= 4; year++)
        {
            double excessShortage = salary - totalCost; //using the fundamental excess/shortage calculation
            System.out.printf("%-14s%-1s%-16.2f%-1s%-14.2f%-1s%-19.2f%-1s%-15.2f%-1s%-24.2f\n", (int) year, "$", tuition, "$", roomBoard, "$", totalCost, "$", salary, "$", excessShortage); //prints initial values
            newTuition = newTuition + tuition; //calculating the tuition for each year
            newRoomBoard = newRoomBoard + roomBoard; //calculating the room and board for each year
            newTotalCost = newTotalCost + totalCost; //calculating the total cost for each year
            newSalary = newSalary + salary; ////calculating the salary for each year
            newExcessShortage = newExcessShortage + excessShortage; //calculating the excess/shortage for each year
            tuition = tuition * tuitionRate; //using the tuition increase rate
            roomBoard = roomBoard * rbRate; //using the room and board increase rate
            salary = salary * salaryRate; //using the salary increase rate
        }
        System.out.printf("%-14s%-1s%-16.2f%-1s%-14.2f%-1s%-19.2f%-1s%-15.2f%-1s%-24.2f", "Total", "$", newTuition, "$", newRoomBoard, "$", newTotalCost, "$", newSalary, "$", newExcessShortage); //prints new values
    }
}
/* Sample Output:
Year          Tuition          Rm&Bd          Total Cost          Salary          Excess/Shortage          
1             $4000.00         $9500.00       $13500.00           $14000.00       $500.00                  
2             $4600.00         $10450.00      $13500.00           $14560.00       $1060.00                 
3             $5290.00         $11495.00      $13500.00           $15142.40       $1642.40                 
4             $6083.50         $12644.50      $13500.00           $15748.10       $2248.10                 
Total         $19973.50        $44089.50      $54000.00           $59450.50       $5450.50                 
*/