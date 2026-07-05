import java.util.Scanner;

public class leapyear
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year:");
        int a = input.nextInt();
        if ( a % 4 ==0&& a%100 !=0)
        {
            System.out.println("It is leap year");
        } else if (a%400 ==0) {
            System.out.println("It is leap year");
        } else
        {
            System.out.println("Is not leap year");
        }
    }
}
