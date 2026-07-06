import java.util.Scanner;

public class Smallestofthree
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First num:");
        int x1 = input.nextInt();
        System.out.print("Enter the Second num:");
        int x2 = input.nextInt();
        System.out.print("Enter the Third num:");
        int x3 = input.nextInt();
        if (x1<x2 && x1<x3)
        {
            System.out.println(x1+" is Smallest");
        } else if (x1==x2 && x2==x3)
        {
            System.out.println("num are equal");
        } else if(x2<x1 && x2<x3)
        {
            System.out.println(x2+" is Smallest");
        } else
        {
            System.out.println(x3+" is Smallest");
        }
    }
}
