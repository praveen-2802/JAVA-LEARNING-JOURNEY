import java.util.Scanner;

public class product
{
    public static void main(String[] ards)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        float x1 = input.nextFloat();
        System.out.print("Enter the  secound number:");
        float x2 = input.nextFloat();
        float x3 =x1*x2;
        System.out.println("The product of x1&X2 IS:"+x3);
    }
}
