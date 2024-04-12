/*Project: Module Seven Lesson Three Assignment Two
 * Author: Robin Gao
 * Date: 12/04/18
 * Description: We want to make the program more powerful by using more key-words and appropriate responses
 * I practiced if else statements and using String methods
 * I had difficulty deciding where to put my header and footer comments so I did it on both files
*/
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
              response = "Tell me more about your family.";
        }
        else if (statement.indexOf("song") >= 0)
        {
              response = "What kind of music do you like?"; //song and music makes sense together
        }
        else if (statement.indexOf("name") >= 0)
        {
              response = "What is your name?";
        }
        else if (statement.indexOf("computer") >= 0)
        {
              response = "Do you like computer science?";
        }
        else if (statement.indexOf("hungry") >= 0)
        {
              response = "What kind of food do you like?"; //talking about food when somebody's hungry
        }
        else if (statement.indexOf("thirsty") >= 0)
        {
              response = "What kind of beverage do you like?"; //talking about beverages when somebody's thirsty
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }
}
/* Sample Output:
Hello, let's talk.
hungry
What kind of food do you like?
*/