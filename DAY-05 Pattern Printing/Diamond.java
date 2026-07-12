import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the num of rows::");
        int n= input.nextInt();
        for (int rows = 1; rows <=n; rows++)
        {
            for (int space = 1; space <=n-rows ; space++)
            {
                System.out.print(" ");
            }
            for (int col1 = 1; col1<=2*rows-1; col1++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = n-1; row >=1; row--)
        {
            for (int space1 = 1; space1 <=n-row ; space1++)
            {
                System.out.print(" ");
            }
            for (int col1 = 1; col1 <=2*row-1 ; col1++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
