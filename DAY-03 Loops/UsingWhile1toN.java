import java.util.Scanner;

public class UsingWhile1toN
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the Integer:");
        int n = input.nextInt();
        int a=1;
        while (a<=n)
        {
            System.out.println(a);
            a++;
        }
    }
}
