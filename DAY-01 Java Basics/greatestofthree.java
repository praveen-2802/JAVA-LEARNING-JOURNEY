import java.util.Scanner;

public class greatestofthree
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first num:");
        float a = input.nextFloat();
        System.out.print("Enter the secound num:");
        float b = input.nextFloat();
        System.out.print("Enter the third num:");
        float c = input.nextFloat();
        if ( a>b && a>c){
            System.out.println("Then "+a+" is greatest");
        } else if (b>a && b>c) {
            System.out.println("Then "+b+" is greatest");
        } else
        {
            System.out.println("Then "+c+" is greatest");
        }

    }
}
