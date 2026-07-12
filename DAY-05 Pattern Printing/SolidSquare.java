import java.util.Scanner;

public class SolidSquare
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enteer the Integer::");
        int n= input.nextInt();
        for (int i=1;n>=i;i++)
        {
            for (int j =1;n>j;j++)
            {
                System.out.print("* ");
            }
            System.out.println("*");
        }

    }
}
