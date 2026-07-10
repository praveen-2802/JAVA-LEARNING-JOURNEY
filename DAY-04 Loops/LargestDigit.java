import java.util.Scanner;

public class LargestDigit
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the Num:");
        int n= input.nextInt();
        int largest = 0;
        while(n>0)
        {
            int digit= n%10;
            if (digit>largest)
            {
                largest=digit;
            }
            n/=10;
        }
        System.out.print("Largest::"+largest);
    }
}
