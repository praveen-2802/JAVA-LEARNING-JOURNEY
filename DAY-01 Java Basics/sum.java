import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first num:");
        int a = input.nextInt();
        System.out.print("Enter the secound num:");
        int b = input.nextInt();
        int c = a + b;
        System.out.print("the sum of a & b is:" + c);
    }
}

