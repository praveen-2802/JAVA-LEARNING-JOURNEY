import java.util.Scanner;

public class RightTriangle2
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enteer the Integer::");
        int n= input.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j =1;j<n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}
