import java.io.StringReader;
import java.util.Scanner;

public class SumofNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enteer the integer");
        int a = input.nextInt();
        int x=1;
        int sum=0;
        while (x<=a)
        {
            sum=x+sum;
            x++;
        }
        System.out.println(sum);
    }
}

