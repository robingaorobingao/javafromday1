/*Project: Name That Celebrity
 * Author: Robin Gao
 * Date: 09/18/18
 * Description: using String methods and escape sequences to the Strings and using only one println statement
 * I practiced concatenation and printing everything in a single println statement
 * I had difficulty counting the letters because I miscounted the number of letters I needed for each name but I went in to fix it by recounting and considering the first letter as the 0th
*/
public class RobinGaoMod3ProgramName //class
{
        public static void main(String[] args) //main method
        {
                String s1 = "Taylor Swift";
                String s2 = "John Boyega";
                String s3 = "Emma Stone";
                String taylorSwift = ">>>" + s1.substring(2, 9);
                String johnBoyega = ">>>" + s2.substring(2, 8);
                String emmaStone = ">>>" + s3.substring(2, 7);
                System.out.println(s1.concat(taylorSwift) + "\n" + s2.concat(johnBoyega) + "\n" + s3.concat(emmaStone));
        }
}
/* Sample Output:
Taylor Swift>>>ylor Sw
John Boyega>>>hn Boy
Emma Stone>>>ma St
*/