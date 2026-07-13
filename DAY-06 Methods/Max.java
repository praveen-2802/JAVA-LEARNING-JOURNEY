import java.util.Scanner;

public class Max
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Num:");
        int n = input.nextInt();
        System.out.print("Enter the second Num:");
        int n2 = input.nextInt();
        max(n,n2);
    }
    public static void max(int n,int n2)
    {
        if (n>n2)
        {
            System.out.println("Max: "+n);
        }else
        {
            System.out.println("Max: "+n2);
        }
    }
}
