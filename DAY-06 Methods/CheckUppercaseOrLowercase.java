import java.util.Scanner;

public class CheckUppercaseOrLowercase
{
    public static void main(String[] args)
    {
        checkcase();
    }

    public static void checkcase()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Alphabet:");
        String a = input.nextLine();
        while (a.length() != 1)
        {
            System.out.print("Enter an Single Alphabet:");
            a = input.nextLine();
        }
        char ch = a.charAt(0);
        if (ch >= 'A'&& ch <= 'Z')
        {
            System.out.println("Uppercase Letter");
        } else if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase Letter");
        } else
        {
            System.out.println("Not An Alphabet");
        }
    }
}
