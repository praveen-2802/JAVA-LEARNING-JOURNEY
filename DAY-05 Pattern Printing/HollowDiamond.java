import java.util.Scanner;

public class HollowDiamond
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Num::");
        int n = input.nextInt();
        for (int rows = 1; rows <= n; rows++)
        {
            for (int space = 1; space <= n - rows; space++)
            {
                System.out.print(" ");
            }
            for (int col1 = 1; col1 <= 2 * rows - 1; col1++)
            {
                if (col1==1||col1==2*rows-1||rows==n)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int rows = n-1; rows >=1; rows--)
        {
            for (int space = 1; space <=n-rows; space++)
            {
                System.out.print(" ");
            }
            for (int col = 1; col <=2*rows-1; col++)
            {
                if (col==1||col==2*rows-1||rows==n)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
