import java.util.Scanner;

public class HollowRightAngleTriangle 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Integer::");
        int n = input.nextInt();
        for (int rows = 1; rows <= n; rows++)
        {
            for (int col = 1; col <=rows ; col++) {
                if (rows == 1 || col == 1 || col == rows || rows == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
