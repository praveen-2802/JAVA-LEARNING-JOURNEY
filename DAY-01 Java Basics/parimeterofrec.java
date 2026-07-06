import java.util.Scanner;

public class parimeterofrec
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of height:");
        int x1 = input.nextInt();
        System.out.print("Enter the value of Base:");
        int x2 = input.nextInt();
        int x3 = x1+x2+x1+x2;
        System.out.print("The parimeter of the rectangle is:"+x3);

    }
}
