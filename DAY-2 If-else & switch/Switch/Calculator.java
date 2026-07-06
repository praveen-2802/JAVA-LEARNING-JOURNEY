import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number:");
        double first=input.nextDouble();
        System.out.print("Enter the Second number:");
        double second=input.nextDouble();
        System.out.print("Enter the Operator:");
        char operater = input.next().charAt(0);
        switch(operater)
        {
            case '+':
                System.out.println(first+second);
                break;
            case '-':
                System.out.println(first-second);
                break;
            case '*':
                System.out.println(first*second);
                break;
            case '/':
                System.out.println(first/second);
                break;
            case '%':
                System.out.println(first%second);
                break;
            default:
                System.out.println("Invalid  operator");
        }
    }
}
