import java.util.Scanner;

public class PrintNto1
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enteerr the integer:");
        int x= input.nextInt();
        int n=x;
        while (n>=1)
        {
            System.out.print(n+" ");
            n--;
        }
    }
}
