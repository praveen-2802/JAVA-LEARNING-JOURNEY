import java.util.Scanner;

public class FirstDigit
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enteer the Integer::");
        int n= input.nextInt();
        while (n>9)
        {
            n=n/10;

        }
        System.out.println(n);
    }
}
