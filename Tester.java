/*Project: Practice Activity
 * Author: Robin Gao
 * Date: 10/01/18
 * Description: Operator precedence, Boolean AND and OR and equality
 * I learned about the order of precedence for !, ==, 1=, &&, and ||.
 * I didn't have any difficulties really because I just followed the video tutorial
*/
public class Tester //class
{
	public static void main(String[] args) //main method
	{
		int x = 37;
		int y = 49;
		int z = 37;
		boolean b = true || false && false; //&& has precedence over ||
		System.out.println(b);
	}
}
/* Sample Output:
true
*/