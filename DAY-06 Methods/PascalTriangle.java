import java.util.Scanner;

public class PascalTriangle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = input.nextInt();
        pascaltriangle(num);
    }
    public static void pascaltriangle(int num)
    {
        for (int rows = 1; rows <=num; rows++)
        {
            for (int space = 1; space <=num-rows; space++)
            {
                System.out.print("  ");
            }
            int value=1;
            for (int col = 1; col <=rows; col++)
            {
                System.out.print(value+" ");
                value = value* (rows - col) / col;
            }
            System.out.println("");
        }
    }
}
