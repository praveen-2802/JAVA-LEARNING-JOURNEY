import java.util.Scanner;

public class simpleinterest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rate of interest:");
        float r = input.nextFloat();
        System.out.print("Enter Principal:");
        float p = input.nextFloat();
        System.out.print("Enter Time:");
        float t = input.nextFloat();
        double x3 = (p*r*t)/100;
        System.out.println("The simple interest is:"+x3);

    }
}
