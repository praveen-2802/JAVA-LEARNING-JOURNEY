import java.util.Scanner;

public class PowerOfNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base::");
        int b = input.nextInt();
        System.out.print("Enter the Power::");
        int p = input.nextInt();
        int power=1;
        for (int i =1;i<=p;i++)
        {
            power*=b;
        }
        System.out.println(power);
    }
}
