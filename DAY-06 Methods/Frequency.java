import java.util.Scanner;

public class Frequency
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Integer:");
        int a = input.nextInt();
        System.out.print("Enter a Integer:");
        int b = input.nextInt();
        Frequency(a,b);
    }
    public static void Frequency(int a,int b)
    {
        int count=0;
        while (a!=0)
        {
            int i=a%10;
            if (b==i)
            {
                count++;
            }
            a/=10;
        }
        System.out.print(count);
    }
}
