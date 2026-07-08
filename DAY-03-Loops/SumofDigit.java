import java.util.Scanner;

public class SumofDigit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers:");
        int x= input.nextInt();
        int b=1;
        int sum=0;
        while(x>0)
        {
            int c=x%10;
            sum=c+sum;
            x=x/10;
        }
        System.out.println(sum);
    }
}
