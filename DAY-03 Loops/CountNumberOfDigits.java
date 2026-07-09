import java.util.Scanner;

public class CountNumberOfDigits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enteer the Integer");
        long a= input.nextLong();
        int b= 0;
        while(a!=0)
        {
            a/=10;
            b++;
        }
        System.out.println(b);
    }
}
