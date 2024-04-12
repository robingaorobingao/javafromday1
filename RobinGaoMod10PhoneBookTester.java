/**
 * Robin Gao
 * Phone Book Program 2/17/19
 * I practiced arrays
 * I had no difficulties
 */
public class RobinGaoMod10PhoneBookTester
{
  public static void main ( String[] args )
  {
    RobinGaoMod10PhoneBook pb = new RobinGaoMod10PhoneBook();  
    // search for "Violet Smith"
    RobinGaoMod10PhoneEntry entry = pb.search( "Violet Smith" );
    // if found, print out the entry
    if ( entry != null )
      System.out.println( entry.name + ": " + entry.phone );
    else
      System.out.println("Name not found" );
  }
}
/*
 * PhoneEntry[] phoneBook = new PhoneEntry[5] will say null
 * A linear search algorithm can be used on a full array
 * the two expressions do the same thing
 */