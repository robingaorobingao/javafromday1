/*Project: Module Seven Lesson Three Assignment Two
 * Author: Robin Gao
 * Date: 12/04/18
 * Description: We want to make the program more powerful by using more key-words and appropriate responses
 * I practiced if else statements and using String methods
 * I had difficulty deciding where to put my header and footer comments so I did it on both files
*/
import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
/* Sample Output:
Hello, let's talk.
hungry
What kind of food do you like?
*/