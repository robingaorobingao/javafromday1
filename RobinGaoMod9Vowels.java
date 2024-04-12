public class RobinGaoMod9Vowels
{
    /*
     * Method: isAVowel
     * Purpose: will return true if a given character is a vowel and returns false if the character is not a vowel
     * Pre: needs characters to evaluate from string characters and parameter j
     * Post: returns true or false
     */
    public boolean isAVowel(String user, int j) //boolean because it returns true or false
    {
        if ((user.charAt(j) == 'a') || (user.charAt(j) == 'e') || (user.charAt(j) == 'i') || (user.charAt(j) == 'o') || (user.charAt(j) == 'u') || (user.charAt(j) == 'A') || (user.charAt(j) == 'E') || (user.charAt(j) == 'I') || (user.charAt(j) == 'O') || (user.charAt(j) == 'U'))
        {
            return true; //true because it has come across a vowel
        }
        else
        {
            return false; //false because it has come across a consonant
        }
    }
    /*
     * Method: isAConsonant
     * Purpose: will return true if a given character is a consonant and returns false if the character is not a consonant
     * Pre: needs characters to evaluate from string characters and parameter j
     * Post: returns true or false
     */
    public String isAConsonant(String user, int j) //the code is the opposite of the vowel method
    {
        if ((user.charAt(j) == 'a') || (user.charAt(j) == 'e') || (user.charAt(j) == 'i') || (user.charAt(j) == 'o') || (user.charAt(j) == 'u') || (user.charAt(j) == 'A') || (user.charAt(j) == 'E') || (user.charAt(j) == 'I') || (user.charAt(j) == 'O') || (user.charAt(j) == 'U'))
        {
            return false; //false because it has come across a vowel
        }
        else
        {
            return true; //true because it has come across a consonant
        }
    }
}
