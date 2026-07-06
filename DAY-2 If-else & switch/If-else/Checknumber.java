import java.util.Scanner;

public class Checknumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num:");
        int x1 = input.nextInt();
        if (x1>=100 && x1<1000)
        {
            System.out.println(x1+" Is Three-Digit number");
        } else if (x1>=10 && x1<100)
        {
            System.out.println(x1+" Is Two-Digit number");
        }else if (x1>=-1000 && x1<-100)
        {
            System.out.println(x1+" Is Three-Digit number");
        }else if (x1>=-100 && x1<-10)
        {
            System.out.println(x1+" Is Two-Digit number");
        } else if (x1>-10 && x1<10)
        {
            System.out.println(x1+" Is one-Digit number");
        }else {
            System.out.println("Not a three-digiit number");
        }
    }
}
