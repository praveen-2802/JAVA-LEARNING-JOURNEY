import java.util.Scanner;

public class aritmaticope
{
    public static void main(String[] ergs)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double x1 = input.nextDouble();
        System.out.print("Enter the  secound number:");
        double x2 = input.nextDouble();
        System.out.println(x1+x2);
        System.out.println(x1-x2);
        System.out.println(x1*x2);
        System.out.println(x1/x2);
        System.out.println(x1%x2);
    }
}
