import java.util.Scanner;

public class Categorizeage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Age:");
        float a = input.nextFloat();
        if (a<=13)
        {
            System.out.println("You are a Chid");
        } else if (a<=20)
        {
            System.out.println("You are an Teen");
        } else if (a<=60)
        {
            System.out.println("You are an Adult");
        } else
        {
            System.out.println("You are an senior");
        }
    }
}
