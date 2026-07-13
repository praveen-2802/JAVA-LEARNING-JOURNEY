import java.util.Scanner;

public class OnetoN
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the N:");
        int n =input.nextInt();
        onetoN(n);
    }
    public static void onetoN(int n)
    {
        for (int i = 1; i<=n ; i++)
        {
            System.out.println(i);
        }
    }
}
