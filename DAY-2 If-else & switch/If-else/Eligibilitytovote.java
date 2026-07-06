import java.util.Scanner;

public class Eligibilitytovote
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Age:");
        int age = input.nextInt();
        if (age>=18)
        {
            System.out.println("Eigible to vote");
        } else if (age<0)
        {
            System.out.println("Invalid Age");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
    }
}
