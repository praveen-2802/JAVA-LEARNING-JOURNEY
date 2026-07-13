import java.util.Scanner;

public class PermutationCombination
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of num:");
        int num = input.nextInt();
        System.out.print("Enter Value of r:");
        int r = input.nextInt();
        if (r>num)
        {
            System.out.println("Invalid input");
            return;
        }else
        {
            int npr= factorial(num) / factorial(num-r);
            System.out.println(npr);
            int ncr= factorial(num)/(factorial(r)* factorial(num-r));
            System.out.println(ncr);
        }
    }
    public static int factorial(int num)
    {
        int fact=1;
        while(num>=1)
        {
            fact=fact*num;
            num--;
        }
        return(fact);
    }
}
