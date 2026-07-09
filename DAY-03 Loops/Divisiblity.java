import java.util.Scanner;

public class Divisiblity
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enteer your Integer::");
        int n= input.nextInt();
        int a=1;
        while(a<=n)
        {
            if (a%5==0 && a%3==0)
            {
                System.out.print(a+" ");
            }
            a++;
        }
    }
}
