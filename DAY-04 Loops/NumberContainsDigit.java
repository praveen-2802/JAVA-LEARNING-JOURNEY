import java.util.Scanner;

public class NumberContainsDigit
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a Number::");
        int n= input.nextInt();
        System.out.print("Enter a Digit(0-9)::");
        int d= input.nextInt();
        boolean found= false;
        while(n>0)
        {
            int digit= n%10;
            if (digit==d)
            {
                found= true;
                break;
            }
            n/=10;
        }
        if (found)
        {
            System.out.println("Digit Found");
        } else
        {
        System.out.println("Digit Not Found");
        }
    }
}
