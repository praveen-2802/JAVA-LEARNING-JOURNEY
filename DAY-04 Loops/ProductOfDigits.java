import java.util.Scanner;

public class ProductOfDigits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number::");
        int n = input.nextInt();
        int a= 1;
        while (n>1)
        {
            int i=n%10;
            a=i*a;
            n/=10;
        }
        System.out.println(a);
    }
}
