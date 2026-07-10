import java.util.Scanner;

public class EvenOddDigits
{
    public static void main(String[] atgs)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enterr the Integer::");
        int a= input.nextInt();
        int even=0;
        int odd=0;
        while(a>0)
        {
            int di= a%10;
            if (di%2==0)
            {
                even++;
            }else
            {
                odd++;
            }
            a/=10;
        }
        System.out.println("even:"+even);
        System.out.println("Odd:"+odd);
    }
}
