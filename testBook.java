/**
 * Watch the Library project video 1 (11:03), the Library project video 2 (18:36) and Library project video 3 (7:26) video
 * @author (Robin Gao)
 * @version (1/8/18)
 * I practiced constructors and objects and methods
 * I had no difficulty because I was following the video tutorials
 */
public class testBook
{
    public static void main(String[] args)
    {
        Book myBook1 = new Book("Alice in Wonderland, Lewis Carroll");
        Book myBook2 = new Book();
        Book myBook3 = new Book("On the highway", "Jen Jones");
        System.out.println("" + myBook1);
        System.out.println("" + myBook3);
        myBook2.setTitle("Alphabet 123");
        myBook2.setAuthor("Sam Smith");
        System.out.println("" + myBook2);
        myBook3.setAuthor("Jennifer Jones");
        System.out.println("\n" + myBook3);
        System.out.print(myBook1.getAuthor());
        System.out.println(myBook1.getTitle());
        System.out.println(myBook4);
    }
}
