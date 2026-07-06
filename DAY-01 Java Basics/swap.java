import java.util.Scanner;

public class swap
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the swap num game");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value you wanna swap:");
        int a = input.nextInt();
        System.out.print("Enter the second value you wanna swap:");
        int b = input.nextInt();
        int c=a;
        a= b;
        System.out.println("The value of a is know:"+a);
        b=c;
        System.out.print("The value of b is know:"+b);
    }
}
