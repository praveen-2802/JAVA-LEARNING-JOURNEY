import java.util.Scanner;

public class Daysinmonths
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number form btw 1 to 12:");
        int months = input.nextInt();
        switch (months)
        {
            case 1:
                System.out.println("January as 31 Days");
                break;
            case 2:
                System.out.println("Febuary as 28 Days");
                break;
            case 3:
                System.out.println("March as 31 Days");
                break;
            case 4:
                System.out.println("April as 30 Days");
                break;
            case 5:
                System.out.println("May as 31 Days");
                break;
            case 6:
                System.out.println("June as 30 Days");
                break;
            case 7:
                System.out.println("July as 31 Days");
                break;
            case 8:
                System.out.println("August as 31 Days");
                break;
            case 9:
                System.out.println("September as 30 Days");
                break;
            case 10:
                System.out.println("October as 31 Days");
                break;
            case 11:
                System.out.println("November as 30 Days");
                break;
            case 12:
                System.out.println("December as 31 Days");
                break;
            default:
                System.out.println("The num is invalid");

        }
    }
}
