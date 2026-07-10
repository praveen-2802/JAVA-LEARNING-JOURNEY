import java.util.Scanner;

public class FrequencyOfDigit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enterr the Number::");
        int n = input.nextInt();
        System.out.print("Enter the Digit to Search::");
        int d = input.nextInt();
        int count=0;
        while (n>0)
        {
            int a = n%10;
            if (a==d)
            {
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
