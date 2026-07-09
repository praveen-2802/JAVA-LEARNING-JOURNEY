import java.util.Scanner;

public class Charactercheck
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character:");
        String sc =input.nextLine();
        if (sc.length() !=1)
        {
            System.out.println("Please enter single character");
        }
        char ch = sc.charAt(0);
        if (ch>='A' && ch<='Z')
        {
            System.out.println("Its an uppercase character");
        } else if (ch>='a'&& ch<='z')
        {
            System.out.println("It's an lowercase characcter");
        }else if (ch<='9'&&ch>='0')
        {
            System.out.println("It's an number");
        } else
        {
            System.out.println("It's an special symbol");
        }

    }

}
