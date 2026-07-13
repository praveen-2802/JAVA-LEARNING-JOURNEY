import java.util.Scanner;

public class PrintName
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name =input.nextLine();
        printname(name);

    }
    public static void printname(String name)
    {
        System.out.println("Your Name:"+name );

    }
}
