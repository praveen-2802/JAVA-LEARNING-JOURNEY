import java.util.Scanner;

public class Square
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the N:");
        int n = input.nextInt();
        square(n);
    }
    public static void square(int n)
    {
        System.out.println(n*n);
    }
}
