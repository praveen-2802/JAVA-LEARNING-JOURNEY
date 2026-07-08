import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enteer your Integer:");
        int a= input.nextInt();
        int reverse =0;
        while (a>0)
        {
            reverse=reverse*10;
            reverse+=(a%10);
            a/=10;
        }
        System.out.println(reverse);
    }
}
