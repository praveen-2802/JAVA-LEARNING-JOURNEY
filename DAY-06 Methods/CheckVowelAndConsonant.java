import java.util.Scanner;

public class CheckVowelAndConsonant
{
    public static void main(String[] args)
    {
        checkVC();
    }

    public static void checkVC()
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
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Vowel");
        } else
        {
            System.out.println("Consonant");
        }
    }
}
