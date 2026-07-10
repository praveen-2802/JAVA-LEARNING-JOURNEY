import java.util.Scanner;

public class LCM
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Two integers::");
        int n1= input.nextInt();
        System.out.print("Enter Two integers::");
        int n2= input.nextInt();
        int lcm = (n1>n2)?n1:n2;
        while(true)
        {
            if (lcm%n2==0 && lcm%n1==0)
            {
                System.out.println("The LCM is::"+lcm);
                break;
            }
                lcm++;
        }
    }
}
