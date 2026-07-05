import java.util.Scanner;

public class Grades
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks:");
        float a = input.nextFloat();
        if (a>=90)
        {
            System.out.println("A grade");
        } else if (a>=75)
        {
            System.out.println("B grade");
        } else if (a>=60)
        {
            System.out.println("C grade");
        } else if (a>=30)
        {
            System.out.println("D grade");
        } else
        {
            System.out.println("F grade");
        }


    }
}
