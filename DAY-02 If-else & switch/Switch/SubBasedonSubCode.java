import java.util.Scanner;

public class SubBasedonSubCode
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Subject Code:");
        int code = input.nextInt();
        switch (code)
        {
            case 101:
                System.out.println("Mathematics");
                break;
            case 102:
                System.out.println("Physics");
                break;
            case 103:
                System.out.println("Chemistry");
                break;
            case 104:
                System.out.println("Java");
                break;
            case 105:
                System.out.println("English");
                break;
            default:
                System.out.println("The num is invalid");

        }
    }
}
