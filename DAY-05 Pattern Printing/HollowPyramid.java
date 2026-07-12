import java.util.Scanner;

public class HollowPyramid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Integer::");
        int n= input.nextInt();
        for (int rows = 1; rows <=n ; rows++)
        {
            for (int space = 1; space <=n-rows; space++)
            {
                System.out.print(" ");
            }
            for (int col = 1; col <=2*rows-1 ; col++)
            {
                if (col==1||col==2*rows-1||rows==n)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
