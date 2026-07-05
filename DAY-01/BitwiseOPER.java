import java.util.Scanner;

public class BitwiseOPER
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int x1 = input.nextInt();
        System.out.print("Enter the  secound number:");
        int x2 = input.nextInt();
        int x3 = x1&x2;
        int x4 = x1|x2;
        int x5 = x1^x2;
        int x6 = ~x1;
        int x7 = x1<<x2;
        int x8 = x1>>x2;
        System.out.println("Answer is:"+x3);
        System.out.println("Answer is:"+x4);
        System.out.println("Answer is:"+x5);
        System.out.println("Answer is:"+x6);
        System.out.println("Answer is:"+x7);
        System.out.println("Answer is:"+x8);
    }
}
