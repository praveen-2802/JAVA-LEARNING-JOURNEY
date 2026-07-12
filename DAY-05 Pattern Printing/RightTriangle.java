import java.util.Scanner;

public class RightTriangle
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enteer the Integer::");
        int n= input.nextInt();
        for (int i=0;n>i;i++)
        {
            for (int j =1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}