import java.util.Scanner;

public class CountOddDIgit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n Integer:");
        int n = input.nextInt();
        count(n);
    }
    public static void count(int n)
    {
            int count=0;
            while (n!=0)
            {
                int a=n%10;
                if (a%2==1)
                {
                    count++;
                }
                n/=10;
            }
            System.out.print(count);
    }
}

