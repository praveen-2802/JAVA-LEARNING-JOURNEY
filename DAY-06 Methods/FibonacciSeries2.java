import java.util.Scanner;

public class FibonacciSeries2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int a = input.nextInt();
        fibonacci(a);
    }
    public static void fibonacci(int a)
    {
        int b=0;
        int c=1;
        int sum;
        for (int i = 1; i <=a ; i++)
        {
            System.out.print(b+" ");
            sum=b+c;
            b=c;
            c=sum;
        }
    }
}
