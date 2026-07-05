import java.util.Scanner;

public class Areaoftriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of height:");
        float height = input.nextFloat();
        System.out.print("Enter the value of Base:");
        float base = input.nextFloat();
        double x3 = 0.5*base*height;
        System.out.println("The area of triangle is:"+x3);

    }
}
