import javax.swing.*;
import java.util.Scanner;

public class Checkvowel
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character:");
        String sc =input.nextLine();
        if (sc.length() !=1)
        {
            System.out.println("Please enter single character");
            return;
        }
        char ch =Character.toLowerCase(sc.charAt(0));
        if (!Character.isLetter(ch))
        {
            System.out.println("Please enter an alphabet");
            return;
        }
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Its an Vowel");
        } else
        {
            System.out.println("It's an consonant");
        }
    }
}
