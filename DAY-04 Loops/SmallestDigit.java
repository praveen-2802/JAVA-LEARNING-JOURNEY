import java.util.Scanner;

public class SmallestDigit
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the Integer::");
        int n= input.nextInt();
        int smallest= 9;
        while(n>0)
        {
            int i = n%10;
            if (i<smallest)
            {
                smallest=i;

            }
            n/=10;
        }
        System.out.println("Smallest is::"+smallest);
    }
}
