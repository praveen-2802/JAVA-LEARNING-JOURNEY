import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enteer thr Integer:");
        int a= input.nextInt();
        int b=1;
        while(b<=10)
        {
            System.out.println(a+"*"+b+"="+a*b);
            b++;
        }
    }
}
