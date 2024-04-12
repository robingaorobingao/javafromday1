/**
 * Write a program that will convert the user’s weight on earth to their weight on a selected planet or the earth's moon
 * Robin Gao
 * Space Weight 2/14/19
 * I practiced arrays
 * I had difficulty with finding where to place my arrays but I found out that if I place it outside of my testing method with "public static" used in front then it'll work for the whole code
 */
import java.io.*;
import java.util.*; //scanner things
public class RobinGaoMod10SpaceWeightTester
{
    public static void main (String[] args)
    {
        RobinGaoMod10SpaceWeight planet = new RobinGaoMod10SpaceWeight(); //object
        Scanner input = new Scanner (System.in); //scanner
        int number; //declared here to be used by the whole loop
        System.out.print("Convert your weight on earth to:\n1. Mercury\n2. Venus\n3. Uranus\n4. Mars\n5. Jupiter\n6. Saturn\n7. Neptune\n8. Pluto\n9. Moon\nSelect a destination by number: "); //prompt, without quit option here first because that wouldn't make sense
        do
        {
            number = input.nextInt(); //user input
            if ((number < 1) || (number > 9))
            {
                System.out.print("Invalid destination"); //none of the options, can be used for quitting the program later
            }
            else
            {
                System.out.print("Enter your weight: "); //prompt
                double weight = input.nextDouble(); //user input
                System.out.print("Your weight on ");
                planet.mercury(number, weight); //respective methods underneath
                planet.venus(number, weight);
                planet.uranus(number, weight);
                planet.mars(number, weight);
                planet.jupiter(number, weight);
                planet.saturn(number, weight);
                planet.neptune(number, weight);
                planet.pluto(number, weight);
                planet.moon(number, weight);
                System.out.print("\nConvert your weight on earth to:\n1. Mercury\n2. Venus\n3. Uranus\n4. Mars\n5. Jupiter\n6. Saturn\n7. Neptune\n8. Pluto\n9. Moon\n10. Quit\nSelect a destination by number (or 10 to quit): "); //prompt
            }
        }
        while ((number > 0) && (number < 10)); //stops if the input is 10, but really it'll stop because of the if else statement anyway
    }
}
/* sample output:
Convert your weight on earth to:
1. Mercury
2. Venus
3. Uranus
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Moon
Select a destination by number: 4
Enter your weight: 4
Your weight on Mars would be 1.52 pounds
Convert your weight on earth to:
1. Mercury
2. Venus
3. Uranus
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Moon
10. Quit
Select a destination by number (or 10 to quit): 3
Enter your weight: 3
Your weight on Uranus would be 2.67 pounds
Convert your weight on earth to:
1. Mercury
2. Venus
3. Uranus
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Moon
10. Quit
Select a destination by number (or 10 to quit): 2
Enter your weight: 2
Your weight on Venus would be 1.82 pounds
Convert your weight on earth to:
1. Mercury
2. Venus
3. Uranus
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Moon
10. Quit
Select a destination by number (or 10 to quit): 1
Enter your weight: 1
Your weight on Mercury would be 0.38 pounds
Convert your weight on earth to:
1. Mercury
2. Venus
3. Uranus
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Moon
10. Quit
Select a destination by number (or 10 to quit): 0
Invalid destination
*/