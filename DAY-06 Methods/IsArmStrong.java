import java.util.Scanner;

public class IsArmStrong
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = input.nextInt();
        armstrong(n);
    }
    public static void armstrong(int n)
    {
        int temp=n;
        int a;
        int b;
        int sum=0;
        while(n>0)
        {
            a=n%10;
            b=a*a*a;
            sum=sum+b;
            n/=10;
        }

        if (sum==temp)
        {
            System.out.println(sum+" Is ArmStrong Number");
        }else
        {
            System.out.println(sum+" Is not Armstrong Number");
        }
    }
}
