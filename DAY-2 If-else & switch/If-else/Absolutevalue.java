import java.util.Scanner;

public class Absolutevalue
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Num want to convert into absolute:");
        int x1 = input.nextInt();
        float x3 = -(x1);
        if (x1<0)
        {
            System.out.println(x3);
        } else
        {
            System.out.println(x1);
        }
    }
}
