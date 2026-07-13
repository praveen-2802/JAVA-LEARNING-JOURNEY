import java.util.Scanner;

public class SwapMethod
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = input.nextInt();
        System.out.print("Enter b:");
        int b = input.nextInt();
        swap(a,b);
    }
    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}